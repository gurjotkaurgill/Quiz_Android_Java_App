package com.example.assignment3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

public class QuestionBank {
    ArrayList<Integer> colors;
    public ArrayList<Integer> getColors(Context context) {
        if(colors == null) {
            colors = new ArrayList<>(10);
            colors.add(context.getColor(R.color.HotPink));
            colors.add(context.getColor(R.color.Crimson));
            colors.add(context.getColor(R.color.SandyBrown));
            colors.add(context.getColor(R.color.IndianRed));
            colors.add(context.getColor(R.color.DarkOrchid));
            colors.add(context.getColor(R.color.SaddleBrown));
            colors.add(context.getColor(R.color.LightSlateGray));
            colors.add(context.getColor(R.color.ForestGreen));
            colors.add(context.getColor(R.color.Sienna));
            colors.add(context.getColor(R.color.Purple));
        }
        return colors;
    }
    ArrayList<Question> questions;
    public ArrayList<Question> getQuestions(Context context) {
        if(questions == null) {
            questions = new ArrayList<>(10);
            ArrayList<Integer> shuffledColors = getColors(context);
            Collections.shuffle(shuffledColors);
            questions.add(new Question(context.getResources().getString(R.string.ques1),false, shuffledColors.get(0)));
            questions.add(new Question(context.getResources().getString(R.string.ques2),true,shuffledColors.get(1)));
            questions.add(new Question(context.getResources().getString(R.string.ques3),false,shuffledColors.get(2)));
            questions.add(new Question(context.getResources().getString(R.string.ques4),true,shuffledColors.get(3)));
            questions.add(new Question(context.getResources().getString(R.string.ques5),true,shuffledColors.get(4)));
            questions.add(new Question(context.getResources().getString(R.string.ques6),false,shuffledColors.get(5)));
            questions.add(new Question(context.getResources().getString(R.string.ques7),false,shuffledColors.get(6)));
            questions.add(new Question(context.getResources().getString(R.string.ques8),true,shuffledColors.get(7)));
            questions.add(new Question(context.getResources().getString(R.string.ques9),false,shuffledColors.get(8)));
            questions.add(new Question(context.getResources().getString(R.string.ques10),true,shuffledColors.get(9)));
        }
        return questions;
    }
}
