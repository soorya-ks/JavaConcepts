package com.matheesh.concurrency.producer_consumer;

import java.util.List;

public class Producer implements Runnable {

    List<Integer> questionList = null;
    final private int LIMIT = 5;
    private int questionNo;
    public Producer(List<Integer> QuestionList) {
        this.questionList = QuestionList;
    }

    public void readQuestion(int questionNo) throws InterruptedException {

        synchronized (questionList) {
            while (questionList.size() == LIMIT) {
                System.out.println("Question stack is full... Waiting for users to Answer them");
                questionList.wait();
            }
        }

        synchronized (questionList){
            Thread.sleep(100);
            questionList.add(questionNo);
            System.out.println("Created question " + questionNo);
            questionList.notify();
        }
    }

    public void run() {

        try {
            while(true)
            readQuestion(questionNo++);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
