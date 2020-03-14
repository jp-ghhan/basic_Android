/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_leaderboard.*
import kotlinx.android.synthetic.main.list_view_item.view.*

/**
 * Shows a static leaderboard with three users.
 */
class Leaderboard : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_leaderboard, container, false)
    }

    //Viewが生成されたら
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //RecyclerViewを生成する
        val viewAdapter = MyAdapter(listOfAvatarNames)
        leaderboard_list.adapter = viewAdapter
    }
}


//RecyclerViewのAdapterを生成
class MyAdapter(private val avatarData: Array<Int>) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(val item: View) : RecyclerView.ViewHolder(item)

    //RecyclerViewのitemViewを生成する
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_view_item, parent, false)
        return ViewHolder(itemView)
    }

    //コンテンツを設定する
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item.run {
            user_avatar_image.setImageResource(listOfAvatarImages[position])
            user_name_text.text = resources.getString(listOfAvatarNames[position])
            user_rank_text.text = resources.getString(R.string.ranks, position + 1)
        }
    }

    // Return the size of your avatarData = 3
    override fun getItemCount() = avatarData.size
}

//AvatarNames
private val listOfAvatarNames = arrayOf(
        R.string.word_avatar1, R.string.word_avatar2, R.string.word_avatar3
)

//AvatarImages
private val listOfAvatarImages = listOf(
        R.drawable.avatar_1_raster, R.drawable.avatar_2_raster, R.drawable.avatar_3_raster)
