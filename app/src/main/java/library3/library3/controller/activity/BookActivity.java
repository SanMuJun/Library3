package library3.library3.controller.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import cn.sharesdk.onekeyshare.OnekeyShare;
import library3.library3.R;
import library3.library3.model.bean.BookBean;

public class BookActivity extends Activity {




    @ViewInject(R.id.iv_book_image)
    private ImageView iv_book_image;

    @ViewInject(R.id.tv_book_name)
    private TextView  tv_book_name;


    @ViewInject(R.id.tv_book_author)
    private TextView  tv_book_author;

    @ViewInject(R.id.tv_book_publish)
    private TextView  tv_book_publish;

    @ViewInject(R.id.tv_book_publicationtime)
    private TextView  tv_book_publicationtime;

    @ViewInject(R.id.tv_book_location)
    private TextView  tv_book_location;

    @ViewInject(R.id.tv_book_isborrow)
    private TextView  tv_book_isborrow;

    @ViewInject(R.id.tv_book_remain_number)
    private TextView  tv_book_remain_number;

    @ViewInject(R.id.tv_book_number)
    private TextView  tv_book_number;

    @ViewInject(R.id.tv_book_ISBN)
    private TextView  tv_book_ISBN;

    @ViewInject(R.id.tv_book_net_url)
    private TextView  tv_book_net_url;

    @ViewInject(R.id.tv_book_sort)
    private TextView  tv_book_sort;

    @ViewInject(R.id.tv_book_content_all)
    private TextView  tv_book_content_all;

    @ViewInject(R.id.bt_share)
    private Button bt_share;
    private int listview_state;
    private int bookId;
    private int informationId;
    private String jsonSringData;
    private int otherBookId;
    private int economyBookId;
    private int scienceTechnologyBookId;
    private int historyBookId;
    private int literatureBookId;
    private int machineLearningBookId;
    private int liveBookId;

    private BookBean.BookAll bookAll;
    private BookBean.Book.Information informationData;
    private BookBean.Book.MachineLearning machineLearningData;
    private BookBean.Book.Literature literatureData;
    private BookBean.Book.History historyData;
    private BookBean.Book.ScienceTechnology scienceTechnologyData;
    private BookBean.Book.Economy economyData;
    private BookBean.Book.Other otherData;
    private BookBean.Book.Live liveData;

    private String ImageUrlShared="";
    private String BookTitleName="";
    private String DuBanURL="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        x.view().inject(this);

        initView();

        jsonSringData = getIntent().getStringExtra("jsonSringData");

        informationId = getIntent().getIntExtra("informationId", 1);
        liveBookId = getIntent().getIntExtra("liveBookId", 2);
        machineLearningBookId = getIntent().getIntExtra("machineLearningBookId", 3);
        literatureBookId = getIntent().getIntExtra("literatureBookId", 4);
        historyBookId = getIntent().getIntExtra("historyBookId", 5);
        scienceTechnologyBookId = getIntent().getIntExtra("scienceTechnologyBookId", 6);
        economyBookId = getIntent().getIntExtra("economyBookId", 7);
        otherBookId = getIntent().getIntExtra("otherBookId", 8);

        bookId = getIntent().getIntExtra("bookId", 9);
        listview_state = getIntent().getIntExtra("LISTVIEW_STATE", -1);

        getDataFromVolley(jsonSringData);



    }

    private void initView() {



    }

    private void getDataFromVolley(String jsonSringData) {


        BookBean  jsonStringBookActivityData=pasredJson(jsonSringData);

        //信息的类的详细页面
        if (listview_state==1){

            informationData = jsonStringBookActivityData.Book.get(0).Information.get(informationId);

            x.image().bind(iv_book_image,informationData.bookImageUrl);

            tv_book_name.setText("书名："+informationData.bookName);
            tv_book_author.setText("作者："+informationData.bookAuthor);
            tv_book_publish.setText("出版社："+informationData.bookPulish);
            tv_book_publicationtime.setText("出版时间："+informationData.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+informationData.bookFloor);
            tv_book_isborrow.setText("是否被借出："+informationData.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+informationData.bookNumber);
            tv_book_ISBN.setText("ISBN："+informationData.bookISBN);
            tv_book_sort.setText("所属类别："+informationData.bookSort);
            tv_book_content_all.setText("内容："+informationData.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl",informationData.bookInternetUrl);

                    startActivity(intent);
                }
            });

            ImageUrlShared=informationData.bookImageUrl;
            BookTitleName= informationData.bookName;
            DuBanURL= informationData.bookInternetUrl;
            bt_share.setOnClickListener(new OnClickListenerShare());


        }

        //生活的类的详细页面
        if (listview_state==2){

            liveData = jsonStringBookActivityData.Book.get(1).Live.get(liveBookId);


            x.image().bind(iv_book_image, liveData.bookImageUrl);

            tv_book_name.setText("书名："+ liveData.bookName);
            tv_book_author.setText("作者："+ liveData.bookAuthor);
            tv_book_publish.setText("出版社："+ liveData.bookPulish);
            tv_book_publicationtime.setText("出版时间："+ liveData.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+ liveData.bookFloor);
            tv_book_isborrow.setText("是否被借出："+ liveData.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+ liveData.bookNumber);
            tv_book_ISBN.setText("ISBN："+ liveData.bookISBN);
            tv_book_sort.setText("所属类别："+ liveData.bookSort);
            tv_book_content_all.setText("内容："+ liveData.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl", liveData.bookInternetUrl);

                    startActivity(intent);
                }
            });
            ImageUrlShared=liveData.bookImageUrl;
            BookTitleName=liveData .bookName;
            DuBanURL= liveData.bookInternetUrl;
            bt_share.setOnClickListener(new OnClickListenerShare());


        }


        //机械的类的详细页面
        if (listview_state==3){

            machineLearningData = jsonStringBookActivityData.Book.get(2).MachineLearning.get(machineLearningBookId);

            x.image().bind(iv_book_image,machineLearningData.bookImageUrl);

            tv_book_name.setText("书名："+machineLearningData.bookName);
            tv_book_author.setText("作者："+machineLearningData.bookAuthor);
            tv_book_publish.setText("出版社："+machineLearningData.bookPulish);
            tv_book_publicationtime.setText("出版时间："+machineLearningData.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+machineLearningData.bookFloor);
            tv_book_isborrow.setText("是否被借出："+machineLearningData.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+machineLearningData.bookNumber);
            tv_book_ISBN.setText("ISBN："+machineLearningData.bookISBN);
            tv_book_sort.setText("所属类别："+machineLearningData.bookSort);
            tv_book_content_all.setText("内容："+machineLearningData.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl",machineLearningData.bookInternetUrl);

                    startActivity(intent);
                }
            });
            ImageUrlShared=machineLearningData.bookImageUrl;
            BookTitleName= machineLearningData.bookName;
            DuBanURL= machineLearningData.bookInternetUrl;
            bt_share.setOnClickListener(new OnClickListenerShare());


        }


        //文学的类的详细页面
        if (listview_state==4){

            literatureData = jsonStringBookActivityData.Book.get(3).Literature.get(literatureBookId);

            x.image().bind(iv_book_image,literatureData.bookImageUrl);

            tv_book_name.setText("书名："+literatureData.bookName);
            tv_book_author.setText("作者："+literatureData.bookAuthor);
            tv_book_publish.setText("出版社："+literatureData.bookPulish);
            tv_book_publicationtime.setText("出版时间："+literatureData.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+literatureData.bookFloor);
            tv_book_isborrow.setText("是否被借出："+literatureData.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+literatureData.bookNumber);
            tv_book_ISBN.setText("ISBN："+literatureData.bookISBN);
            tv_book_sort.setText("所属类别："+literatureData.bookSort);
            tv_book_content_all.setText("内容："+literatureData.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl",literatureData.bookInternetUrl);

                    startActivity(intent);
                }
            });
            ImageUrlShared=literatureData.bookImageUrl;
            BookTitleName= literatureData.bookName;
            DuBanURL= literatureData.bookInternetUrl;
            bt_share.setOnClickListener(new OnClickListenerShare());


        }



        //历史的类的详细页面
        if (listview_state==5){

            historyData = jsonStringBookActivityData.Book.get(4).History.get(historyBookId);

            x.image().bind(iv_book_image,historyData.bookImageUrl);

            tv_book_name.setText("书名："+historyData.bookName);
            tv_book_author.setText("作者："+historyData.bookAuthor);
            tv_book_publish.setText("出版社："+historyData.bookPulish);
            tv_book_publicationtime.setText("出版时间："+historyData.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+historyData.bookFloor);
            tv_book_isborrow.setText("是否被借出："+historyData.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+historyData.bookNumber);
            tv_book_ISBN.setText("ISBN："+historyData.bookISBN);
            tv_book_sort.setText("所属类别："+historyData.bookSort);
            tv_book_content_all.setText("内容："+historyData.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl",historyData.bookInternetUrl);

                    startActivity(intent);
                }
            });
            ImageUrlShared=historyData.bookImageUrl;
            BookTitleName= historyData.bookName;
            DuBanURL= historyData.bookInternetUrl;
            bt_share.setOnClickListener(new OnClickListenerShare());


        }



        //科技的类的详细页面
        if (listview_state==6){

            scienceTechnologyData = jsonStringBookActivityData.Book.get(5).ScienceTechnology.get(scienceTechnologyBookId);

            x.image().bind(iv_book_image,scienceTechnologyData.bookImageUrl);

            tv_book_name.setText("书名："+scienceTechnologyData.bookName);
            tv_book_author.setText("作者："+scienceTechnologyData.bookAuthor);
            tv_book_publish.setText("出版社："+scienceTechnologyData.bookPulish);
            tv_book_publicationtime.setText("出版时间："+scienceTechnologyData.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+scienceTechnologyData.bookFloor);
            tv_book_isborrow.setText("是否被借出："+scienceTechnologyData.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+scienceTechnologyData.bookNumber);
            tv_book_ISBN.setText("ISBN："+scienceTechnologyData.bookISBN);
            tv_book_sort.setText("所属类别："+scienceTechnologyData.bookSort);
            tv_book_content_all.setText("内容："+scienceTechnologyData.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl",scienceTechnologyData.bookInternetUrl);

                    startActivity(intent);
                }
            });
            ImageUrlShared=scienceTechnologyData.bookImageUrl;
            BookTitleName= scienceTechnologyData.bookName;
            DuBanURL= scienceTechnologyData.bookInternetUrl;
            bt_share.setOnClickListener(new OnClickListenerShare());


        }



        //经济的类的详细页面
        if (listview_state==7){

            economyData = jsonStringBookActivityData.Book.get(6).Economy.get(economyBookId);

            x.image().bind(iv_book_image,economyData.bookImageUrl);

            tv_book_name.setText("书名："+economyData.bookName);
            tv_book_author.setText("作者："+economyData.bookAuthor);
            tv_book_publish.setText("出版社："+economyData.bookPulish);
            tv_book_publicationtime.setText("出版时间："+economyData.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+economyData.bookFloor);
            tv_book_isborrow.setText("是否被借出："+economyData.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+economyData.bookNumber);
            tv_book_ISBN.setText("ISBN："+economyData.bookISBN);
            tv_book_sort.setText("所属类别："+economyData.bookSort);
            tv_book_content_all.setText("内容："+economyData.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl",economyData.bookInternetUrl);

                    startActivity(intent);
                }
            });
            ImageUrlShared=economyData.bookImageUrl;
            BookTitleName= economyData.bookName;
            DuBanURL= economyData.bookInternetUrl;
            bt_share.setOnClickListener(new OnClickListenerShare());


        }




        //其他的类的详细页面
        if (listview_state==8){

            otherData = jsonStringBookActivityData.Book.get(7).Other.get(otherBookId);

            x.image().bind(iv_book_image,otherData.bookImageUrl);

            tv_book_name.setText("书名："+otherData.bookName);
            tv_book_author.setText("作者："+otherData.bookAuthor);
            tv_book_publish.setText("出版社："+otherData.bookPulish);
            tv_book_publicationtime.setText("出版时间："+otherData.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+otherData.bookFloor);
            tv_book_isborrow.setText("是否被借出："+otherData.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+otherData.bookNumber);
            tv_book_ISBN.setText("ISBN："+otherData.bookISBN);
            tv_book_sort.setText("所属类别："+otherData.bookSort);
            tv_book_content_all.setText("内容："+otherData.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl",otherData.bookInternetUrl);

                    startActivity(intent);
                }
            });
            ImageUrlShared=otherData.bookImageUrl;
            BookTitleName=otherData .bookName;
            DuBanURL= otherData.bookInternetUrl;
                    bt_share.setOnClickListener(new OnClickListenerShare());


        }









        //查询的详细页面
        if (listview_state==10){

            bookAll = jsonStringBookActivityData.BookAll.get(bookId);

            x.image().bind(iv_book_image, bookAll.bookImageUrl);

            tv_book_name.setText("书名："+ bookAll.bookName);
            tv_book_author.setText("作者："+ bookAll.bookAuthor);
            tv_book_publish.setText("出版社："+ bookAll.bookPulish);
            tv_book_publicationtime.setText("出版时间："+ bookAll.bookPublicationTime);
            tv_book_location.setText("书所在的位置："+ bookAll.bookFloor);
            tv_book_isborrow.setText("是否被借出："+ bookAll.bookIsBorrow);
            tv_book_remain_number.setText("剩余本数：5");
            tv_book_number.setText("书的序号："+ bookAll.bookNumber);
            tv_book_ISBN.setText("ISBN："+ bookAll.bookISBN);
            tv_book_sort.setText("所属类别："+ bookAll.bookSort);
            tv_book_content_all.setText("内容："+ bookAll.bookContent+"。。。");

            tv_book_net_url.setText("豆瓣所在：点击前往豆瓣");

            tv_book_net_url.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookActivity.this, ToDouBanActivity.class);
                    intent.putExtra("bookInternetUrl", bookAll.bookInternetUrl);

                    startActivity(intent);
                }
            });
            ImageUrlShared=bookAll.bookImageUrl;
            BookTitleName= bookAll.bookName;
            DuBanURL= bookAll.bookInternetUrl;
            bt_share.setOnClickListener(new OnClickListenerShare());
        }


    }

    private BookBean pasredJson(String jsonSringData) {
        return new Gson().fromJson(jsonSringData,BookBean.class);
    }

    private class OnClickListenerShare implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(BookActivity.this, "分享功能已经上线", Toast.LENGTH_SHORT).show();
            showShare();
        }
    }


    private void showShare() {
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();
        // title标题，印象笔记、邮箱、信息、微信、人人网、QQ和QQ空间使用
        oks.setTitle(BookTitleName);
        // titleUrl是标题的网络链接，仅在Linked-in,QQ和QQ空间使用
        oks.setTitleUrl(DuBanURL);
        // text是分享文本，所有平台都需要这个字段
        oks.setText("分享内容");
        //分享网络图片，新浪微博分享网络图片需要通过审核后申请高级写入接口，否则请注释掉测试新浪微博
        oks.setImageUrl(ImageUrlShared);
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl(DuBanURL);
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("评论:");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite("图书馆App");
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl(DuBanURL);

// 启动分享GUI
        oks.show(this);
    }
}
