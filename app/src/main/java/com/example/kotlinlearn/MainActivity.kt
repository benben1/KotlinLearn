package com.example.kotlinlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 2.4.2 when条件语句
        whenStudy()
        // 2.4.3 循环语句
        forStudy()

        // 2.5.1 面向对象编程
        mianxiangduixiang()
        // 2.5.2 继承

    }

    private fun mianxiangduixiang() {
        val p = Person()
        p.name = "Tom"
        p.age = 18
        p.eat()
    }

    private fun forStudy() {
        // 创建一个0到10的区间 [0,10]
        val range = 0..10
        // 创建一个0到9的区间[0,9)
        val range1 = 0 until 10
        // 使用for-in循环来遍历这个区间 每次递增1
//        for (i in range) {
//            println("num $i")
//        }
        // 每次递增2
//        for (i in range1 step 2){
//            println("num $i")
//        }
        // 创建 一个降维的区间
        for (i in 10 downTo 1) {
            println("num $i")
        }

    }

    private fun whenStudy() {
        fun getScore(name: String) = if (name == "Tom") {
            86
        } else if (name == "Jim") {
            76
        } else if (name == "Jack") {
            66
        } else if (name == "Lily") {
            56
        } else {
            0
        }

        // 使用when简化
        fun getScoreWhen(name: String) = when (name) {
            "Tom" -> 86
            "Jim" -> 76
            "Jack" -> 66
            "Lily" -> 56
            else -> 0
        }

        // when 类型匹配
        fun checkNumber(num: Number) {
            when (num) {
                is Int -> println("num is Int")
                is Double -> println("num is Double")
                else -> println("num not support")
            }
        }

        val num = 1L
        println(checkNumber(num))

        // when 不带参数类型 可以单独处理每个参数
        fun getScore2(name: String) = when {
            name.startsWith("Tom") -> 86
            name == "Jim" -> 76
            name == "Jack" -> 66
            name == "Lily" -> 56
            else -> 0
        }
    }
}