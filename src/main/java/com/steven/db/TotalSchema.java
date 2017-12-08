package com.steven.db;

public class TotalSchema {
	
	private String name;
	private String vpip;
	private String pfr;
	private String desc;
	
	private int per_flop_all;
	private String per_flop_bet;
	private String per_flop_call;
	private String per_flop_fold;
	private String per_flop_limp;
	private String per_flop_raise;
	private String per_flop_bet_fold;
	private String per_flop_bet_call;
	private String per_flop_bet_raise;
	private String per_flop_call_fold;
	private String per_flop_call_call;
	private String per_flop_call_raise;
	private String per_flop_limp_fold;
	private String per_flop_limp_call;
	private String per_flop_limp_raise;
	private String per_flop_raise_fold;
	private String per_flop_raise_call;
	private String per_flop_raise_raise;
	
	private int flop_all;
	private String flop_bet;
	private String flop_check;
	private String flop_call;
	private String flop_fold;
	private String flop_raise;
	private String flop_bet_call;
	private String flop_bet_fold;
	private String flop_bet_raise;
	private String flop_check_call;
	private String flop_check_fold;
	private String flop_check_raise ;
	private String flop_raise_fold;
	private String flop_raise_call;
	private String flop_raise_raise;
	
	private int turn_all;
	private String turn_bet;
	private String turn_check;
	private String turn_call;
	private String turn_fold;
	private String turn_raise;
	private String turn_bet_call;
	private String turn_bet_fold;
	private String turn_bet_raise;
	private String turn_check_call;
	private String turn_check_fold;
	private String turn_check_raise ;
	private String turn_raise_fold;
	private String turn_raise_call;
	private String turn_raise_raise;
	
	private int river_all;
	private String river_bet;
	private String river_check;
	private String river_call;
	private String river_fold;
	private String river_raise;
	private String river_bet_call;
	private String river_bet_fold;
	private String river_bet_raise;
	private String river_check_call;
	private String river_check_fold;
	private String river_check_raise ;
	private String river_raise_fold;
	private String river_raise_call;
	private String river_raise_raise;
	
	private int per_flop_bet_num;
	private int per_flop_call_num;
	private int per_flop_limp_num;
	private int per_flop_raise_num;
	
	private int flop_bet_num;
	private int flop_check_num;
	private int flop_raise_num;
	
	private int turn_bet_num;
	private int turn_check_num;
	private int turn_raise_num;
	
	private int river_bet_num;
	private int river_check_num;
	private int river_raise_num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVpip() {
		return vpip;
	}
	public void setVpip(String vpip) {
		this.vpip = vpip;
	}
	public String getPfr() {
		return pfr;
	}
	public void setPfr(String pfr) {
		this.pfr = pfr;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPer_flop_all() {
		return per_flop_all;
	}
	public void setPer_flop_all(int per_flop_all) {
		this.per_flop_all = per_flop_all;
	}
	public String getPer_flop_bet() {
		return per_flop_bet;
	}
	public void setPer_flop_bet(String per_flop_bet) {
		this.per_flop_bet = per_flop_bet;
	}
	public String getPer_flop_call() {
		return per_flop_call;
	}
	public void setPer_flop_call(String per_flop_call) {
		this.per_flop_call = per_flop_call;
	}
	public String getPer_flop_fold() {
		return per_flop_fold;
	}
	public void setPer_flop_fold(String per_flop_fold) {
		this.per_flop_fold = per_flop_fold;
	}
	public String getPer_flop_limp() {
		return per_flop_limp;
	}
	public void setPer_flop_limp(String per_flop_limp) {
		this.per_flop_limp = per_flop_limp;
	}
	public String getPer_flop_raise() {
		return per_flop_raise;
	}
	public void setPer_flop_raise(String per_flop_raise) {
		this.per_flop_raise = per_flop_raise;
	}
	public String getPer_flop_bet_fold() {
		return per_flop_bet_fold;
	}
	public void setPer_flop_bet_fold(String per_flop_bet_fold) {
		this.per_flop_bet_fold = per_flop_bet_fold;
	}
	public String getPer_flop_bet_call() {
		return per_flop_bet_call;
	}
	public void setPer_flop_bet_call(String per_flop_bet_call) {
		this.per_flop_bet_call = per_flop_bet_call;
	}
	public String getPer_flop_bet_raise() {
		return per_flop_bet_raise;
	}
	public void setPer_flop_bet_raise(String per_flop_bet_raise) {
		this.per_flop_bet_raise = per_flop_bet_raise;
	}
	public String getPer_flop_call_fold() {
		return per_flop_call_fold;
	}
	public void setPer_flop_call_fold(String per_flop_call_fold) {
		this.per_flop_call_fold = per_flop_call_fold;
	}
	public String getPer_flop_call_call() {
		return per_flop_call_call;
	}
	public void setPer_flop_call_call(String per_flop_call_call) {
		this.per_flop_call_call = per_flop_call_call;
	}
	public String getPer_flop_call_raise() {
		return per_flop_call_raise;
	}
	public void setPer_flop_call_raise(String per_flop_call_raise) {
		this.per_flop_call_raise = per_flop_call_raise;
	}
	public String getPer_flop_limp_fold() {
		return per_flop_limp_fold;
	}
	public void setPer_flop_limp_fold(String per_flop_limp_fold) {
		this.per_flop_limp_fold = per_flop_limp_fold;
	}
	public String getPer_flop_limp_call() {
		return per_flop_limp_call;
	}
	public void setPer_flop_limp_call(String per_flop_limp_call) {
		this.per_flop_limp_call = per_flop_limp_call;
	}
	public String getPer_flop_limp_raise() {
		return per_flop_limp_raise;
	}
	public void setPer_flop_limp_raise(String per_flop_limp_raise) {
		this.per_flop_limp_raise = per_flop_limp_raise;
	}
	public String getPer_flop_raise_fold() {
		return per_flop_raise_fold;
	}
	public void setPer_flop_raise_fold(String per_flop_raise_fold) {
		this.per_flop_raise_fold = per_flop_raise_fold;
	}
	public String getPer_flop_raise_call() {
		return per_flop_raise_call;
	}
	public void setPer_flop_raise_call(String per_flop_raise_call) {
		this.per_flop_raise_call = per_flop_raise_call;
	}
	public String getPer_flop_raise_raise() {
		return per_flop_raise_raise;
	}
	public void setPer_flop_raise_raise(String per_flop_raise_raise) {
		this.per_flop_raise_raise = per_flop_raise_raise;
	}
	public int getFlop_all() {
		return flop_all;
	}
	public void setFlop_all(int flop_all) {
		this.flop_all = flop_all;
	}
	public String getFlop_bet() {
		return flop_bet;
	}
	public void setFlop_bet(String flop_bet) {
		this.flop_bet = flop_bet;
	}
	public String getFlop_check() {
		return flop_check;
	}
	public void setFlop_check(String flop_check) {
		this.flop_check = flop_check;
	}
	public String getFlop_call() {
		return flop_call;
	}
	public void setFlop_call(String flop_call) {
		this.flop_call = flop_call;
	}
	public String getFlop_fold() {
		return flop_fold;
	}
	public void setFlop_fold(String flop_fold) {
		this.flop_fold = flop_fold;
	}
	public String getFlop_raise() {
		return flop_raise;
	}
	public void setFlop_raise(String flop_raise) {
		this.flop_raise = flop_raise;
	}
	public String getFlop_bet_call() {
		return flop_bet_call;
	}
	public void setFlop_bet_call(String flop_bet_call) {
		this.flop_bet_call = flop_bet_call;
	}
	public String getFlop_bet_fold() {
		return flop_bet_fold;
	}
	public void setFlop_bet_fold(String flop_bet_fold) {
		this.flop_bet_fold = flop_bet_fold;
	}
	public String getFlop_bet_raise() {
		return flop_bet_raise;
	}
	public void setFlop_bet_raise(String flop_bet_raise) {
		this.flop_bet_raise = flop_bet_raise;
	}
	public String getFlop_check_call() {
		return flop_check_call;
	}
	public void setFlop_check_call(String flop_check_call) {
		this.flop_check_call = flop_check_call;
	}
	public String getFlop_check_fold() {
		return flop_check_fold;
	}
	public void setFlop_check_fold(String flop_check_fold) {
		this.flop_check_fold = flop_check_fold;
	}
	public String getFlop_check_raise() {
		return flop_check_raise;
	}
	public void setFlop_check_raise(String flop_check_raise) {
		this.flop_check_raise = flop_check_raise;
	}
	public String getFlop_raise_fold() {
		return flop_raise_fold;
	}
	public void setFlop_raise_fold(String flop_raise_fold) {
		this.flop_raise_fold = flop_raise_fold;
	}
	public String getFlop_raise_call() {
		return flop_raise_call;
	}
	public void setFlop_raise_call(String flop_raise_call) {
		this.flop_raise_call = flop_raise_call;
	}
	public String getFlop_raise_raise() {
		return flop_raise_raise;
	}
	public void setFlop_raise_raise(String flop_raise_raise) {
		this.flop_raise_raise = flop_raise_raise;
	}
	public int getTurn_all() {
		return turn_all;
	}
	public void setTurn_all(int turn_all) {
		this.turn_all = turn_all;
	}
	public String getTurn_bet() {
		return turn_bet;
	}
	public void setTurn_bet(String turn_bet) {
		this.turn_bet = turn_bet;
	}
	public String getTurn_check() {
		return turn_check;
	}
	public void setTurn_check(String turn_check) {
		this.turn_check = turn_check;
	}
	public String getTurn_call() {
		return turn_call;
	}
	public void setTurn_call(String turn_call) {
		this.turn_call = turn_call;
	}
	public String getTurn_fold() {
		return turn_fold;
	}
	public void setTurn_fold(String turn_fold) {
		this.turn_fold = turn_fold;
	}
	public String getTurn_raise() {
		return turn_raise;
	}
	public void setTurn_raise(String turn_raise) {
		this.turn_raise = turn_raise;
	}
	public String getTurn_bet_call() {
		return turn_bet_call;
	}
	public void setTurn_bet_call(String turn_bet_call) {
		this.turn_bet_call = turn_bet_call;
	}
	public String getTurn_bet_fold() {
		return turn_bet_fold;
	}
	public void setTurn_bet_fold(String turn_bet_fold) {
		this.turn_bet_fold = turn_bet_fold;
	}
	public String getTurn_bet_raise() {
		return turn_bet_raise;
	}
	public void setTurn_bet_raise(String turn_bet_raise) {
		this.turn_bet_raise = turn_bet_raise;
	}
	public String getTurn_check_call() {
		return turn_check_call;
	}
	public void setTurn_check_call(String turn_check_call) {
		this.turn_check_call = turn_check_call;
	}
	public String getTurn_check_fold() {
		return turn_check_fold;
	}
	public void setTurn_check_fold(String turn_check_fold) {
		this.turn_check_fold = turn_check_fold;
	}
	public String getTurn_check_raise() {
		return turn_check_raise;
	}
	public void setTurn_check_raise(String turn_check_raise) {
		this.turn_check_raise = turn_check_raise;
	}
	public String getTurn_raise_fold() {
		return turn_raise_fold;
	}
	public void setTurn_raise_fold(String turn_raise_fold) {
		this.turn_raise_fold = turn_raise_fold;
	}
	public String getTurn_raise_call() {
		return turn_raise_call;
	}
	public void setTurn_raise_call(String turn_raise_call) {
		this.turn_raise_call = turn_raise_call;
	}
	public String getTurn_raise_raise() {
		return turn_raise_raise;
	}
	public void setTurn_raise_raise(String turn_raise_raise) {
		this.turn_raise_raise = turn_raise_raise;
	}
	public int getRiver_all() {
		return river_all;
	}
	public void setRiver_all(int river_all) {
		this.river_all = river_all;
	}
	public String getRiver_bet() {
		return river_bet;
	}
	public void setRiver_bet(String river_bet) {
		this.river_bet = river_bet;
	}
	public String getRiver_check() {
		return river_check;
	}
	public void setRiver_check(String river_check) {
		this.river_check = river_check;
	}
	public String getRiver_call() {
		return river_call;
	}
	public void setRiver_call(String river_call) {
		this.river_call = river_call;
	}
	public String getRiver_fold() {
		return river_fold;
	}
	public void setRiver_fold(String river_fold) {
		this.river_fold = river_fold;
	}
	public String getRiver_raise() {
		return river_raise;
	}
	public void setRiver_raise(String river_raise) {
		this.river_raise = river_raise;
	}
	public String getRiver_bet_call() {
		return river_bet_call;
	}
	public void setRiver_bet_call(String river_bet_call) {
		this.river_bet_call = river_bet_call;
	}
	public String getRiver_bet_fold() {
		return river_bet_fold;
	}
	public void setRiver_bet_fold(String river_bet_fold) {
		this.river_bet_fold = river_bet_fold;
	}
	public String getRiver_bet_raise() {
		return river_bet_raise;
	}
	public void setRiver_bet_raise(String river_bet_raise) {
		this.river_bet_raise = river_bet_raise;
	}
	public String getRiver_check_call() {
		return river_check_call;
	}
	public void setRiver_check_call(String river_check_call) {
		this.river_check_call = river_check_call;
	}
	public String getRiver_check_fold() {
		return river_check_fold;
	}
	public void setRiver_check_fold(String river_check_fold) {
		this.river_check_fold = river_check_fold;
	}
	public String getRiver_check_raise() {
		return river_check_raise;
	}
	public void setRiver_check_raise(String river_check_raise) {
		this.river_check_raise = river_check_raise;
	}
	public String getRiver_raise_fold() {
		return river_raise_fold;
	}
	public void setRiver_raise_fold(String river_raise_fold) {
		this.river_raise_fold = river_raise_fold;
	}
	public String getRiver_raise_call() {
		return river_raise_call;
	}
	public void setRiver_raise_call(String river_raise_call) {
		this.river_raise_call = river_raise_call;
	}
	public String getRiver_raise_raise() {
		return river_raise_raise;
	}
	public void setRiver_raise_raise(String river_raise_raise) {
		this.river_raise_raise = river_raise_raise;
	}
	public int getPer_flop_bet_num() {
		return per_flop_bet_num;
	}
	public void setPer_flop_bet_num(int per_flop_bet_num) {
		this.per_flop_bet_num = per_flop_bet_num;
	}
	public int getPer_flop_call_num() {
		return per_flop_call_num;
	}
	public void setPer_flop_call_num(int per_flop_call_num) {
		this.per_flop_call_num = per_flop_call_num;
	}
	public int getPer_flop_limp_num() {
		return per_flop_limp_num;
	}
	public void setPer_flop_limp_num(int per_flop_limp_num) {
		this.per_flop_limp_num = per_flop_limp_num;
	}
	public int getPer_flop_raise_num() {
		return per_flop_raise_num;
	}
	public void setPer_flop_raise_num(int per_flop_raise_num) {
		this.per_flop_raise_num = per_flop_raise_num;
	}
	public int getFlop_bet_num() {
		return flop_bet_num;
	}
	public void setFlop_bet_num(int flop_bet_num) {
		this.flop_bet_num = flop_bet_num;
	}
	public int getFlop_check_num() {
		return flop_check_num;
	}
	public void setFlop_check_num(int flop_check_num) {
		this.flop_check_num = flop_check_num;
	}
	public int getFlop_raise_num() {
		return flop_raise_num;
	}
	public void setFlop_raise_num(int flop_raise_num) {
		this.flop_raise_num = flop_raise_num;
	}
	public int getTurn_bet_num() {
		return turn_bet_num;
	}
	public void setTurn_bet_num(int turn_bet_num) {
		this.turn_bet_num = turn_bet_num;
	}
	public int getTurn_check_num() {
		return turn_check_num;
	}
	public void setTurn_check_num(int turn_check_num) {
		this.turn_check_num = turn_check_num;
	}
	public int getTurn_raise_num() {
		return turn_raise_num;
	}
	public void setTurn_raise_num(int turn_raise_num) {
		this.turn_raise_num = turn_raise_num;
	}
	public int getRiver_bet_num() {
		return river_bet_num;
	}
	public void setRiver_bet_num(int river_bet_num) {
		this.river_bet_num = river_bet_num;
	}
	public int getRiver_check_num() {
		return river_check_num;
	}
	public void setRiver_check_num(int river_check_num) {
		this.river_check_num = river_check_num;
	}
	public int getRiver_raise_num() {
		return river_raise_num;
	}
	public void setRiver_raise_num(int river_raise_num) {
		this.river_raise_num = river_raise_num;
	}
}