package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvlist = findViewById<RecyclerView>(R.id.rv_list)


    }
}

val contacts = listOf(
    Contact(
        name = "Sofia",
        phone = "912 345 678",
        icon = R.drawable.Sample1
    ),
    Contact(
        name = "Bruna",
        phone = "923 456 789",
        icon = R.drawable.Sample2
    ),
    Contact(
        name = "João",
        phone = "934 567 890",
        icon = R.drawable.Sample3
    ),
    Contact(
        name = "Miguel",
        phone = "961 234 567",
        icon = R.drawable.Sample4
    ),
    Contact(
        name = "Gabriel",
        phone = "962 345 678",
        icon = R.drawable.Sample5
    ),
    Contact(
        name = "Leonor",
        phone = "963 456 789",
        icon = R.drawable.Sample6
    ),
    Contact(
        name = "David",
        phone = "964 567 890",
        icon = R.drawable.Sample7
    ),
    Contact(
        name = "Olivia",
        phone = "965 678 901",
        icon = R.drawable.Sample8
    ),
    Contact(
        name = "Ayrton",
        phone = "918 765 432",
        icon = R.drawable.Sample9
    ),
    Contact(
        name = "Artur",
        phone = "929 876 543",
        icon = R.drawable.Sample10
    ),
    Contact(
        name = "Victor",
        phone = "930 765 432",
        icon = R.drawable.Sample11
    ),
    Contact(
        name = "Helena",
        phone = "966 123 456",
        icon = R.drawable.Sample12
    ),
    Contact(
        name = "Rita",
        phone = "967 234 567",
        icon = R.drawable.Sample13
    ),
    Contact(
        name = "Gabriela",
        phone = "968 345 678",
        icon = R.drawable.Sample14
    ),
    Contact(
        name = "Diego",
        phone = "969 456 789",
        icon = R.drawable.Sample15
    ),
    Contact(
        name = "Antonio",
        phone = "989 534 579",
        icon = R.drawable.Sample16
    )

)