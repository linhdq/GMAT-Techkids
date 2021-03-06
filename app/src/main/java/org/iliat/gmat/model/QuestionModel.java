package org.iliat.gmat.model;

import android.content.Context;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by hungtran on 4/17/16.
 */
public class QuestionModel extends RealmObject {
    @PrimaryKey
    private String id;
    private String idInServer;
    private String type;
    private String subType;
    private String stimulus;
    private String stem;
    private int timeToFinish=0;
    private int rightAnswerIndex;
    private int userAnswer;
    private RealmList<AnswerModel> answerList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdInServer() {
        return idInServer;
    }

    public void setIdInServer(String idInServer) {
        this.idInServer = idInServer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getStimulus() {
        return stimulus;
    }

    public void setStimulus(String stimulus) {
        this.stimulus = stimulus;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public int getRightAnswerIndex() {
        return rightAnswerIndex;
    }

    public void setRightAnswerIndex(int rightAnswerIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public RealmList<AnswerModel> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(RealmList<AnswerModel> answerList) {
        this.answerList = answerList;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        this.userAnswer = userAnswer;
        realm.commitTransaction();
    }

    public int getTimeToFinish() {
        return timeToFinish;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }
}
