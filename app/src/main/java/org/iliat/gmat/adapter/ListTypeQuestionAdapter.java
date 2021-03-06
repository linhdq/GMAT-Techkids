package org.iliat.gmat.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.iliat.gmat.R;
import org.iliat.gmat.model.QuestionType;

import java.util.ArrayList;

/**
 * Created by MrBom on 5/13/2016.
 */
public class ListTypeQuestionAdapter extends BaseAdapter {

    private Context context = null;
    private ArrayList<QuestionType> list = null;
    private LayoutInflater inflater = null;

    public ListTypeQuestionAdapter(Context context, ArrayList<QuestionType> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(this.context);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView != null) {
            return convertView;
        }
        View view = inflater.inflate(R.layout.item_question_type_on_list, null);
        QuestionType questionType = list.get(position);
        if (view != null && questionType != null) {
            TextView txtPackName = (TextView) view.findViewById(R.id.sumary_pack_name);
            TextView txtTotalQues = (TextView) view.findViewById(R.id.sumary_total_question);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.sumary_progress);
            txtPackName.setText(questionType.getTypeName());
            txtTotalQues.setText(questionType.getTotalQuestion()+" questions");
            progressBar.setMax(questionType.getTotalQuestion());
            progressBar.setProgress(questionType.getTotalRightAnswer());
        }
        return view;
    }
}
