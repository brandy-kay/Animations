package com.adhanjas.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adhanjas.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setTabs()

    }
    private fun setTabs(){
        val adapter=ViewPagerAdapter(supportFragmentManager)
        adapter.addFragments(AnimationFragment(),"Animation")
        adapter.addFragments(CountryFragment(),"Countries")
        binding.tabsViewPager.adapter=adapter
        binding.tablayout.setupWithViewPager(binding.tabsViewPager)
    }

}