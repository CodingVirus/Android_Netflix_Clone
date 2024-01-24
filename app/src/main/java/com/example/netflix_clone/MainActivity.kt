package com.example.netflix_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.netflix_clone.databinding.ActivityMainBinding
import com.example.netflix_clone.fragments.HomeFragment
import com.example.netflix_clone.fragments.MyNetflixFragment
import com.example.netflix_clone.fragments.NewAndHotFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position) {
                    0 -> setFragment(HomeFragment())
                    1 -> setFragment(NewAndHotFragment())
                    2 -> setFragment(MyNetflixFragment())
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })
        setFragment(HomeFragment())
    }

    fun setFragment(frag: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.frame_layout, frag)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }
}
