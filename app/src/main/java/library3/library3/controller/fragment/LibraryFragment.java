package library3.library3.controller.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.xys.libzxing.zxing.activity.CaptureActivity;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import library3.library3.R;
import library3.library3.controller.activity.BookActivity;
import library3.library3.controller.adapter.ListViewLibraryFragmentEconomyAdapter;
import library3.library3.controller.adapter.ListViewLibraryFragmentHistoryAdapter;
import library3.library3.controller.adapter.ListViewLibraryFragmentInformationAdapter;
import library3.library3.controller.adapter.ListViewLibraryFragmentLiteratureAdapter;
import library3.library3.controller.adapter.ListViewLibraryFragmentLiveAdapter;
import library3.library3.controller.adapter.ListViewLibraryFragmentMachineLearningAdapter;
import library3.library3.controller.adapter.ListViewLibraryFragmentOtherAdapter;
import library3.library3.controller.adapter.ListViewLibraryFragmentScienceTechnologyAdapter;
import library3.library3.controller.adapter.ListViewLibraryFragmentSearch;
import library3.library3.controller.adapter.ViewPagerLibraryFragmentAdapter;
import library3.library3.controller.base.BaseFragment;
import library3.library3.controller.base.BasePager;
import library3.library3.controller.pager.LibraryResourcePager;
import library3.library3.controller.pager.NoticePager;
import library3.library3.controller.pager.RecommendationPager;
import library3.library3.controller.pager.SuggestionBoxPager;
import library3.library3.model.bean.BookBean;
import library3.library3.model.bean.BookInfo;
import library3.library3.model.bean.BorrowAndReadInfo;
import library3.library3.model.dao.BookTableDAO;
import library3.library3.model.dao.BorrowAndReadTableDAO;
import library3.library3.utils.Contants;

/**
 * Created by San on 2017/4/10.
 * 图书馆的Fragment
 */
public class LibraryFragment extends BaseFragment implements View.OnClickListener {

    //收搜输入框
    @ViewInject(R.id.et_library_search)
    private EditText et_library_search;
    //收搜
    @ViewInject(R.id.iv_library_search)
    private ImageView iv_library_search;

    @ViewInject(R.id.iv_library_qr)
    private ImageView iv_library_qr;

    //信息
    @ViewInject(R.id.tv_information)
    private TextView tv_information;
    //生活
    @ViewInject(R.id.tv_live)
    private TextView tv_live;
    //机械
    @ViewInject(R.id.tv_machinery)
    private TextView tv_machinery;
    //文学
    @ViewInject(R.id.tv_literature)
    private TextView tv_literature;
    //历史
    @ViewInject(R.id.tv_history)
    private TextView tv_history;
    //科技
    @ViewInject(R.id.tv_sciencetechnology)
    private TextView tv_sciencetechnology;
    //经济
    @ViewInject(R.id.tv_economy)
    private TextView tv_economy;
    //其他
    @ViewInject(R.id.tv_ohher)
    private TextView tv_ohher;

    //viewpager的头布局
    @ViewInject(R.id.tabLayout)
    private TabLayout tabLayout;
    //viewpager
    @ViewInject(R.id.viewPager)
    private ViewPager viewPager;
    //listview
    @ViewInject(R.id.listView)
    private ListView listView;
    //fl_libraryfragment_content
    @ViewInject(R.id.fl_libraryfragment_content)
    private FrameLayout fl_libraryfragment_content;

    private ViewPagerLibraryFragmentAdapter viewPagerLibraryFragmentAdapter;
    private List<BasePager> basePagers;
    private ListViewLibraryFragmentLiveAdapter listViewLibraryFragmentLiveAdapter;
    private ListViewLibraryFragmentInformationAdapter listViewLibraryFragmentInformationAdapter;
    private BookBean bookBeanDateAll;
    private List<BookBean.Book> bookListData;
    private String jsonSringData;
    private List<BookBean.BookAll> bookListAllData;
    private ListViewLibraryFragmentSearch listViewLibraryFragmentSearch;

    private List<BookInfo> bookSearchDataInfo;
    private BookTableDAO bookTableDAO;

    //获取ListViewd的详情页面
    private final static int LISTVIEW_INFORMATION=1;
    private final static int LISTVIEW_LIVE=2;
    private final static int LISTVIEW_MACHINELEARNING=3;
    private final static int LISTVIEW_LITERATURE=4;
    private final static int LISTVIEW_HISTORY=5;
    private final static int LISTVIEW_SCIENCETECHNOLOGY=6;
    private final static int LISTVIEW_ECONOMY=7;
    private final static int LISTVIEW_OTHER=8;

    private final static int LISTVIEW_SEARCH=10;

    private int LISTVIEW_STATE=0;


    //根据不同字段获取不同的书类
    //信息类
    private final static int GET_INFORMATION=0;
    private final static int GET_Live=1;
    private final static int GET_MACHINERY=2;
    private final static int GET_LITERATURE=3;
    private final static int GET_HISTORY=4;
    private final static int GET_SCIENCETECHNOLOGY=5;
    private final static int GET_ECONOMY=6;
    private final static int GET_OTHER=7;

    private int GET_EIGHT_DATA=-1;

    private int studentInfosId;
    private int adminInfosId;
    private boolean adminIsChecked;
    private boolean studentIsChecked;
    private ListViewLibraryFragmentMachineLearningAdapter listViewLibraryFragmentMachineLearningAdapter;
    private ListViewLibraryFragmentLiteratureAdapter listViewLibraryFragmentLiteratureAdapter;
    private ListViewLibraryFragmentHistoryAdapter listViewLibraryFragmentHistoryAdapter;
    private ListViewLibraryFragmentScienceTechnologyAdapter listViewLibraryFragmentScienceTechnologyAdapter;
    private ListViewLibraryFragmentEconomyAdapter listViewLibraryFragmentEconomyAdapter;
    private ListViewLibraryFragmentOtherAdapter listViewLibraryFragmentOtherAdapter;


    public LibraryFragment(List<BorrowAndReadInfo> borrowAndReadInfo, BorrowAndReadTableDAO borrowAndReadTableDAO, int studentInfosId) {
        super(borrowAndReadInfo, borrowAndReadTableDAO, studentInfosId);
    }


    @Override
    public View initView() {

        //设置图书馆页面布局
        View view = View.inflate(context, R.layout.libraryfragment_view, null);
        //注入视图
        x.view().inject(this, view);

        return view;
    }

    @Override
    protected void initData() {

        //获取登陆用户的id
        studentInfosId = getActivity().getIntent().getIntExtra("studentInfosId", -7);
        studentIsChecked = getActivity().getIntent().getBooleanExtra("studentIsChecked", false);
        //获取管理员的id
        adminInfosId = getActivity().getIntent().getIntExtra("adminInfosId", -8);
        adminIsChecked = getActivity().getIntent().getBooleanExtra("adminIsChecked", false);
        Log.e("LibraryFragment","adminInfosId:"+ String.valueOf(adminInfosId));
        Log.e("LibraryFragment", "studentInfosId:"+String.valueOf(studentInfosId));

        //getDataFromXUtils();
        //联网获取数据
        getDataFromVolley();

        //设置点击监听时间
        initListener();

        //获取Viewpager
        getViewPager();
        //获取ListView
        getListView();

    }

    //联网获取数据
    private void getDataFromVolley() {
        String bookUrl = Contants.BOOK_URL;
        RequestQueue mQueue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest(bookUrl,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        jsonSringData = response;

                        processData(response);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TAG", error.getMessage(), error);
            }
        }) {
            //将数据转换为非乱码的文字
            @Override
            protected Response<String> parseNetworkResponse(NetworkResponse response) {
                try {
                    String parsed = new String(response.data, "GBk");
                    return Response.success(parsed, HttpHeaderParser.parseCacheHeaders(response));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                return super.parseNetworkResponse(response);
            }
        };

        mQueue.add(stringRequest);

    }

    private void processData(String result) {

        //总的数据
        bookBeanDateAll = parsedJson(result);
        //分类列表数据
        bookListData = bookBeanDateAll.Book;
        bookListAllData = bookBeanDateAll.BookAll;
        initListener();

    }

    private BookBean parsedJson(String result) {
        return new Gson().fromJson(result, BookBean.class);
    }

    //获取ListView
    private void getListView() {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            int informationId=-1;
            int bookId=-1;
            private int liveBookId=-1;
            private int machineLearningBookId=-1;
            private int literatureBookId=-1;
            private int historyBookId=-1;
            private int scienceTechnologyBookId=-1;
            private int economyBookId=-1;
            private int otherBookId=-1;
            private List<BookBean.Book.Information> bookInformation;
            private List<BookBean.Book.ScienceTechnology> scienceTechnologyBook;
            private List<BookBean.Book.History> historyBook;
            private List<BookBean.Book.Literature> literatureBook;
            private List<BookBean.Book.MachineLearning> machineLearningBook;
            private List<BookBean.Book.Live> liveBook;
            private List<BookBean.Book.Economy> economyBook;
            private List<BookBean.Book.Other> otherBook;

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int id, long l) {


                //获取信息类的数据
                if (LISTVIEW_STATE==LISTVIEW_INFORMATION){
                    bookInformation= bookListData.get(0).Information;
                    informationId = bookInformation.get(id).getBookNumber() - 10001;

                }
                //获取文学的Listview的数据
                if (LISTVIEW_STATE==LISTVIEW_LIVE){
                    liveBook = bookListData.get(1).Live;
                    liveBookId = liveBook.get(id).getBookNumber() - 10011;

                }
                //获取机械的listview的数据
                if (LISTVIEW_STATE==LISTVIEW_MACHINELEARNING){
                    machineLearningBook = bookListData.get(2).MachineLearning;
                    machineLearningBookId = machineLearningBook.get(id).getBookNumber() - 10021;

                }
                //获取文学的ListView的数据
                if (LISTVIEW_STATE==LISTVIEW_LITERATURE){
                    literatureBook = bookListData.get(3).Literature;
                    literatureBookId = literatureBook.get(id).getBookNumber() - 10031;

                }
                //获取历史类的ListView的数据
                if (LISTVIEW_STATE==LISTVIEW_HISTORY){
                    historyBook = bookListData.get(4).History;
                    historyBookId = historyBook.get(id).getBookNumber() - 10041;

                }
                //获取科技的ListView的数据
                if (LISTVIEW_STATE==LISTVIEW_SCIENCETECHNOLOGY){
                    scienceTechnologyBook = bookListData.get(5).ScienceTechnology;
                    scienceTechnologyBookId = scienceTechnologyBook.get(id).getBookNumber() - 10051;

                }
                //获取经济的ListView的数据
                if (LISTVIEW_STATE==LISTVIEW_ECONOMY){
                    economyBook = bookListData.get(6).Economy;
                    economyBookId = economyBook.get(id).getBookNumber() - 10061;

                }
                //获取其他的ListView数据
                if (LISTVIEW_STATE==LISTVIEW_OTHER){
                    otherBook = bookListData.get(7).Other;
                    otherBookId = otherBook.get(id).getBookNumber() - 10071;

                }

                //获取查询的数据
                if (LISTVIEW_STATE==LISTVIEW_SEARCH){
                 bookId = bookSearchDataInfo.get(id).getBookNumber() - 10001;
                }

                Intent intent = new Intent(context, BookActivity.class);

                intent.putExtra("jsonSringData", jsonSringData);

                intent.putExtra("informationId", informationId);
                intent.putExtra("liveBookId", liveBookId);
                intent.putExtra("machineLearningBookId", machineLearningBookId);
                intent.putExtra("literatureBookId", literatureBookId);
                intent.putExtra("historyBookId", historyBookId);
                intent.putExtra("scienceTechnologyBookId", scienceTechnologyBookId);
                intent.putExtra("economyBookId", economyBookId);
                intent.putExtra("otherBookId", otherBookId);

                intent.putExtra("bookId", bookId);



                intent.putExtra("LISTVIEW_STATE",LISTVIEW_STATE);
                startActivity(intent);
            }
        });

    }

    //获取ViewPager
    private void getViewPager() {

        //移除ListView，并添加viewpager
        fl_libraryfragment_content.removeAllViews();
        fl_libraryfragment_content.addView(viewPager);

        //创建pager页面
        basePagers = new ArrayList<>();
        basePagers.add(new NoticePager(context,studentInfosId,adminInfosId,adminIsChecked,studentIsChecked));

        basePagers.add(new RecommendationPager(context,studentInfosId,adminInfosId,studentIsChecked,studentIsChecked));
        basePagers.add(new LibraryResourcePager(context,studentInfosId,adminInfosId,adminIsChecked,studentIsChecked));
        basePagers.add(new SuggestionBoxPager(context,studentInfosId,adminInfosId,studentIsChecked,studentIsChecked));

        //设置viewpager
        viewPagerLibraryFragmentAdapter = new ViewPagerLibraryFragmentAdapter(basePagers);
        viewPager.setAdapter(viewPagerLibraryFragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //获取viewpager的数据
                fl_libraryfragment_content.removeAllViews();
                fl_libraryfragment_content.addView(viewPager);
                BasePager basePagerAdapter = basePagers.get(position);
                basePagerAdapter.initDataBasePager();

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        //获取数据为图书馆的页面
        basePagers.get(0).initDataBasePager();

    }


    private void initListener() {

        //八个图书类的点击事件
        tv_information.setOnClickListener(this);
        tv_live.setOnClickListener(this);
        tv_machinery.setOnClickListener(this);
        tv_literature.setOnClickListener(this);
        tv_history.setOnClickListener(this);
        tv_sciencetechnology.setOnClickListener(this);
        tv_economy.setOnClickListener(this);
        tv_ohher.setOnClickListener(this);


        //收搜的点击事件
        iv_library_search.setOnClickListener(this);
        iv_library_qr.setOnClickListener(this);


    }


    //八个图书类的点击事件的数据添加
    @Override
    public void onClick(View view) {



        if (view == tv_information) {

            if (bookBeanDateAll==null){

                Toast.makeText(context, "您的手机未联网", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(context, "信息", Toast.LENGTH_SHORT).show();

            LISTVIEW_STATE=LISTVIEW_INFORMATION;


            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);
            listViewLibraryFragmentInformationAdapter = new ListViewLibraryFragmentInformationAdapter(
                    context,bookListData);
            listView.setAdapter(listViewLibraryFragmentInformationAdapter);

        } else if (view == tv_live) {

//            getActivity().startActivity(new Intent(context, CaptureActivity.class));
            Toast.makeText(context, "生活", Toast.LENGTH_SHORT).show();

            LISTVIEW_STATE=LISTVIEW_LIVE;

            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);
            listViewLibraryFragmentLiveAdapter = new ListViewLibraryFragmentLiveAdapter(context, bookListData);
            listView.setAdapter(listViewLibraryFragmentLiveAdapter);


        } else if (view == tv_machinery) {
            Toast.makeText(context, "机械", Toast.LENGTH_SHORT).show();

            LISTVIEW_STATE=LISTVIEW_MACHINELEARNING;

            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);
            listViewLibraryFragmentMachineLearningAdapter = new ListViewLibraryFragmentMachineLearningAdapter(context, bookListData);
            listView.setAdapter(listViewLibraryFragmentMachineLearningAdapter);

        } else if (view == tv_literature) {
            Toast.makeText(context, "文学", Toast.LENGTH_SHORT).show();

            LISTVIEW_STATE=LISTVIEW_LITERATURE;

            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);
            listViewLibraryFragmentLiteratureAdapter = new ListViewLibraryFragmentLiteratureAdapter(context, bookListData);
            listView.setAdapter(listViewLibraryFragmentLiteratureAdapter);



        } else if (view == tv_history) {
            Toast.makeText(context, "历史", Toast.LENGTH_SHORT).show();

            LISTVIEW_STATE=LISTVIEW_HISTORY;

            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);
            listViewLibraryFragmentHistoryAdapter = new ListViewLibraryFragmentHistoryAdapter(context, bookListData);
            listView.setAdapter(listViewLibraryFragmentHistoryAdapter);


        } else if (view == tv_sciencetechnology) {
            Toast.makeText(context, "科技", Toast.LENGTH_SHORT).show();

            LISTVIEW_STATE=LISTVIEW_SCIENCETECHNOLOGY;

            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);
            listViewLibraryFragmentScienceTechnologyAdapter = new ListViewLibraryFragmentScienceTechnologyAdapter(context, bookListData);
            listView.setAdapter(listViewLibraryFragmentScienceTechnologyAdapter);


        } else if (view == tv_economy) {
            Toast.makeText(context, "经济", Toast.LENGTH_SHORT).show();

            LISTVIEW_STATE=LISTVIEW_ECONOMY;

            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);
            listViewLibraryFragmentEconomyAdapter = new ListViewLibraryFragmentEconomyAdapter(context, bookListData);
            listView.setAdapter(listViewLibraryFragmentEconomyAdapter);


        } else if (view == tv_ohher) {
            Toast.makeText(context, "其他", Toast.LENGTH_SHORT).show();

            LISTVIEW_STATE=LISTVIEW_OTHER;

            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);
            listViewLibraryFragmentOtherAdapter = new ListViewLibraryFragmentOtherAdapter(context, bookListData);
            listView.setAdapter(listViewLibraryFragmentOtherAdapter);


            //搜索的按钮
        } else if (view == iv_library_search) {

            if (bookBeanDateAll==null){

                Toast.makeText(context, "您的手机未联网", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(et_library_search.getText())) {
                Toast.makeText(context, "您输入的书名字为空", Toast.LENGTH_SHORT).show();
                return;
            }
            LISTVIEW_STATE=LISTVIEW_SEARCH;
            bookTableDAO = new BookTableDAO(context);
            bookSearchDataInfo = bookTableDAO.queryBookTable();

            if (bookSearchDataInfo.size() != 0) {

                for (int z = 0; z < bookSearchDataInfo.size(); z++) {

                    bookTableDAO.deleteBookTable(bookSearchDataInfo.get(z).getBookId());

                }
                bookSearchDataInfo.clear();

            }

            Toast.makeText(context, "正在收搜图书", Toast.LENGTH_SHORT).show();

            for (int i = 0; i < bookListAllData.size(); i++) {
                String bookName = bookListAllData.get(i).bookName;
                String bookAuthor = bookListAllData.get(i).bookAuthor;
                if (bookName.contains(et_library_search.getText())||bookAuthor.contains(et_library_search.getText())) {
                    //将查询得到的图书添加进集合
                    BookInfo bookInfo = new BookInfo(
                            -1,
                            bookListAllData.get(i).bookNumber,
                            bookListAllData.get(i).bookName,
                            bookListAllData.get(i).bookSort,
                            bookListAllData.get(i).bookFloor,
                            bookListAllData.get(i).bookIsBorrow,
                            bookListAllData.get(i).bookAuthor,
                            bookListAllData.get(i).bookPulish,
                            bookListAllData.get(i).bookPublicationTime,
                            bookListAllData.get(i).bookImageUrl,
                            bookListAllData.get(i).bookInternetUrl,
                            bookListAllData.get(i).bookISBN,
                            bookListAllData.get(i).bookContent,
                            bookListAllData.get(i).bookRemainNumber
                    );
                    //将数据存进数据库
                    bookTableDAO.insertBookTable(bookInfo);
                }

            }
            //查询数据
            bookSearchDataInfo = bookTableDAO.queryBookTable();


            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);

            if (bookSearchDataInfo.size() == 0) {
                Toast.makeText(context, "本书库没有此书", Toast.LENGTH_SHORT).show();
                return;
            }

            //设置查询的ListView
            listViewLibraryFragmentSearch = new ListViewLibraryFragmentSearch(context, bookSearchDataInfo);
            listView.setAdapter(listViewLibraryFragmentSearch);
            listViewLibraryFragmentSearch.notifyDataSetChanged();


            //扫描的按钮
        }else if (view == iv_library_qr){


            //打开扫描界面扫描条形码或二维码
            Intent openCameraIntent = new Intent(context, CaptureActivity.class);
            startActivityForResult(openCameraIntent, 0);


        }


    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            Bundle bundle = data.getExtras();
            String scanResult = bundle.getString("result");
            et_library_search.setText(scanResult);



            if (bookBeanDateAll==null){

                Toast.makeText(context, "您的手机未联网", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(et_library_search.getText())) {
                Toast.makeText(context, "您输入的书名字为空", Toast.LENGTH_SHORT).show();
                return;
            }
            LISTVIEW_STATE=LISTVIEW_SEARCH;
            bookTableDAO = new BookTableDAO(context);
            bookSearchDataInfo = bookTableDAO.queryBookTable();

            if (bookSearchDataInfo.size() != 0) {

                for (int z = 0; z < bookSearchDataInfo.size(); z++) {

                    bookTableDAO.deleteBookTable(bookSearchDataInfo.get(z).getBookId());

                }
                bookSearchDataInfo.clear();

            }

            Toast.makeText(context, "正在收搜图书", Toast.LENGTH_SHORT).show();

            for (int i = 0; i < bookListAllData.size(); i++) {

                String bookName = bookListAllData.get(i).bookName;
                String bookAuthor = bookListAllData.get(i).bookAuthor;


                if (bookName.contains(et_library_search.getText())||bookAuthor.contains(et_library_search.getText())) {

                    //将查询得到的图书添加进集合
                    BookInfo bookInfo = new BookInfo(
                            -1,
                            bookListAllData.get(i).bookNumber,
                            bookListAllData.get(i).bookName,
                            bookListAllData.get(i).bookSort,
                            bookListAllData.get(i).bookFloor,
                            bookListAllData.get(i).bookIsBorrow,
                            bookListAllData.get(i).bookAuthor,
                            bookListAllData.get(i).bookPulish,
                            bookListAllData.get(i).bookPublicationTime,
                            bookListAllData.get(i).bookImageUrl,
                            bookListAllData.get(i).bookInternetUrl,
                            bookListAllData.get(i).bookISBN,
                            bookListAllData.get(i).bookContent,
                            bookListAllData.get(i).bookRemainNumber

                    );

                    //将数据存进数据库
                    bookTableDAO.insertBookTable(bookInfo);
                    //查询数据

                }

            }
            bookSearchDataInfo = bookTableDAO.queryBookTable();

            fl_libraryfragment_content.removeAllViews();
            fl_libraryfragment_content.addView(listView);

            if (bookSearchDataInfo.size() == 0) {
                Toast.makeText(context, "本书库没有此书", Toast.LENGTH_SHORT).show();
                return;
            }

            //设置查询的ListView
            listViewLibraryFragmentSearch = new ListViewLibraryFragmentSearch(context, bookSearchDataInfo);
            listView.setAdapter(listViewLibraryFragmentSearch);
            listViewLibraryFragmentSearch.notifyDataSetChanged();
        }
    }


}
