package com.smartjinyu.mybookshelf.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartjinyu.mybookshelf.R;
import com.smartjinyu.mybookshelf.base.rv.BaseMultiClickAdapter;
import com.smartjinyu.mybookshelf.model.bean.Book;

import java.util.List;

/**
 * 作者：Neil on 2017/4/18 21:30.
 * 邮箱：cn.neillee@gmail.com
 * 多选、长按、单击
 */
public class BookMultiClickAdapter extends BaseMultiClickAdapter<Book, BookViewHolder>
        implements View.OnClickListener, View.OnLongClickListener {
    private static final String TAG = BatchAddedAdapter.class.getSimpleName();

    public BookMultiClickAdapter(List<Book> books, Context context) {
        super(books, context);
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.item_booklist_recyclerview, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    protected void bindBaseVH(BookViewHolder holder, int position, Book book) {
        holder.bindBook(book, position, mContext);
        Log.d(TAG, "onBindViewHolder " + position);
    }
}
