package com.algoexp.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Difficulty : Category : Complexity
 *       Easy : Arrays : O(n) : O(n) time | O(k) space - where n is the number of competitions
 *                                and k is the number of teams
 *
 There's an algorithms tournament taking place in which teams of programmers
 compete against each other to solve algorithmic problems as fast as possible.
 Teams compete in a round robin, where each team faces off against all other
 teams. Only two teams compete against each other at a time, and for each
 competition, one team is designated the home team, while the other team is the
 away team. In each competition there's always one winner and one loser; there
 are no ties. A team receives 3 points if it wins and 0 points if it loses. The
 winner of the tournament is the team that receives the most amount of points.


 Given an array of pairs representing the teams that have competed against each
 other and an array containing the results of each competition, write a
 function that returns the winner of the tournament. The input arrays are named


 It's guaranteed that exactly one team will win the tournament and that each
 team will compete against all other teams exactly once. It's also guaranteed
 that the tournament will always have at least two teams.

 competitions =  = [
 ["HTML", "C#"],
 ["C#", "Python"],
 ["Python", "HTML"],
 ]

 results :  = [0, 0, 1]


 o/p:: Python

 // C# beats HTML, Python Beats C#, and Python Beats HTML.
 HTML : 0
 C# : 3
 Python : 6
 */

public class P4TournamentWinner {
    Map<String,Integer> map = new HashMap<>();
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
            for(int i =0 ;i< results.size();i++){
                String player1 = competitions.get(i).get(0);
                String player2 = competitions.get(i).get(1);
                if(results.get(i) == 0){
                    updateScore(player1,0);//TODO : Remove it as "No need as sum of zero changes nothing"
                    updateScore(player2,3);
                }else{
                    updateScore(player1,3);
                    updateScore(player2,0);//TODO : Remove it as "No need as sum of zero changes nothing"
                }

            }
            int maxScore = 0;
            String winner = "";
            for(String key : map.keySet()){
                if(map.get(key) > maxScore){
                    maxScore = map.get(key);
                    winner = key;
                }
            }
        return winner;
    }
    private void updateScore(String player1, int score){
        if(map.containsKey(player1)) {
            int currentScore = map.get(player1);
            int newScore = currentScore + score;
            map.put(player1, newScore);
        }else
        {
            map.put(player1,score);
        }
    }
    //Same logic : less line code
    private void updateScore2(String player1, int score){
        if(!map.containsKey(player1)) {
            map.put(player1,0);
        }
        map.put(player1, map.get(player1)+ score);
    }

}

