package com.algoexp.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayP4 {
    Map<String,Integer> map = new HashMap<>();
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
            for(int i =0 ;i< results.size();i++){
                String player1 = competitions.get(i).get(0);
                String player2 = competitions.get(i).get(1);
                if(results.get(i) == 0){
                    updateScore(player1,0);
                    updateScore(player2,3);
                }else{
                    updateScore(player1,3);
                    updateScore(player2,0);
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

}
/**
 * Difficulty : Category : Complexity
 * Easy : Arrays :


 <p>
 There's an algorithms tournament taking place in which teams of programmers
 compete against each other to solve algorithmic problems as fast as possible.
 Teams compete in a round robin, where each team faces off against all other
 teams. Only two teams compete against each other at a time, and for each
 competition, one team is designated the home team, while the other team is the
 away team. In each competition there's always one winner and one loser; there
 are no ties. A team receives 3 points if it wins and 0 points if it loses. The
 winner of the tournament is the team that receives the most amount of points.
 </p>
 <p>
 Given an array of pairs representing the teams that have competed against each
 other and an array containing the results of each competition, write a
 function that returns the winner of the tournament. The input arrays are named
 <span>competitions</span> and <span>results</span>, respectively. The
 <span>competitions</span> array has elements in the form of
 <span>[homeTeam, awayTeam]</span>, where each team is a string of at most 30
 characters representing the name of the team. The <span>results</span> array
 contains information about the winner of each corresponding competition in the
 <span>competitions</span> array. Specifically, <span>results[i]</span> denotes
 the winner of <span>competitions[i]</span>, where a <span>1</span> in the
 <span>results</span> array means that the home team in the corresponding
 competition won and a <span>0</span> means that the away team won.
 </p>
 <p>
 It's guaranteed that exactly one team will win the tournament and that each
 team will compete against all other teams exactly once. It's also guaranteed
 that the tournament will always have at least two teams.
 </p>

 */
