package com.yhl.androidpremissionlibrary

import android.Manifest
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.wedget.permissionmanager.PermissionListener
import com.wedget.permissionmanager.PermissionUtil

class MainActivity : AppCompatActivity() , PermissionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        PermissionUtil(this).requestOnePermission(Manifest.permission.WRITE_EXTERNAL_STORAGE,this)
        PermissionUtil(this).requestMultiPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_PHONE_STATE), this)
    }

    override fun onGranted() {
        Toast.makeText(this,"onGranted",Toast.LENGTH_SHORT).show()
    }

    override fun onDenied(deniedPermission: MutableList<String>?) {
        Toast.makeText(this,"onDenied",Toast.LENGTH_SHORT).show()
    }

    override fun onShouldShowRationale(deniedPermission: MutableList<String>?) {
        Toast.makeText(this,"onShouldShowRationale",Toast.LENGTH_SHORT).show()
    }
}
