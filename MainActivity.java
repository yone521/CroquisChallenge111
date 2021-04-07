package kr.sswu.croquischallenge;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnLogout;
    Button btnRemove;
    Button btnList;
    TextView imt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //좋아요 리스트
        btnList = (Button) findViewById(R.id.btnList);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), likeActivity.class);
                startActivity(intent);
            }
        });


        //로그아웃
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "로그아웃 완료", Toast.LENGTH_SHORT).show();
            }
        });


        //서비스 탈퇴
        btnRemove = (Button) findViewById(R.id.btnRemove);
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "서비스 탈퇴 완료", Toast.LENGTH_SHORT).show();
            }
        });

        imt = (TextView) findViewById(R.id.imt);
        imt.setText(" 개발자 성신여자대학교 정시공 에이틴");

    }
}