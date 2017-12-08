package com.steven.mediaTools;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.steven.db.TotalSchema;

public class SaveUtils {

	static Logger logger = Logger.getLogger(SaveUtils.class);

	static Map<String, TotalSchema> map = new HashMap<>();

	static File file = new File("results.txt");

	static {
		if (file.exists()) {
			try {
				List<String> strs = FileUtils.readLines(file, "utf-8");
				for (String str : strs) {
					try {
						TotalSchema schema = JSON.parseObject(str, TotalSchema.class);
						map.put(schema.getName(), schema);
					} catch (Exception e) {
					}
				}
			} catch (Exception e) {
			}
		}

	}

	public static void save(TotalSchema schema) throws Exception {
		try {
			logger.info("save begin " + JSON.toJSONString(schema));
			TotalSchema totalSchema = null;
			String name = schema.getName();
			if (map.containsKey(name)) {
				totalSchema = map.get(name);
			} else {
				totalSchema = new TotalSchema();
				totalSchema.setName(name);
			}
			if (isNotEmpty(schema.getDesc())) {
				totalSchema.setDesc(schema.getDesc());
			}

			totalSchema = savePerFlop(totalSchema, schema);
			totalSchema = saveFlop(totalSchema, schema);
			totalSchema = saveTurn(totalSchema, schema);
			totalSchema = saveRiver(totalSchema, schema);
			map.put(name, totalSchema);
			List<String> str = new ArrayList<>();
			for (String key : map.keySet()) {
				str.add(JSON.toJSONString(map.get(key)));
			}
			FileUtils.writeLines(file, str);
			logger.info("save success " + JSON.toJSONString(schema));
		} catch (Exception e) {
			logger.error("save fail " + JSON.toJSONString(schema));
		}
	}

	private static TotalSchema saveFlop(TotalSchema totalSchema, TotalSchema schema) {
		int check = 0;
		int call = 0;
		int bet = 0;
		int raise = 0;
		int fold = 0;
		int all = 0;
		if (isNotEmpty(schema.getFlop_check())) {
			check = Integer.parseInt(schema.getFlop_check());
			all += check;
		}
		if (isNotEmpty(schema.getFlop_call())) {
			call = Integer.parseInt(schema.getFlop_call());
			all += call;
		}
		if (isNotEmpty(schema.getFlop_bet())) {
			bet = Integer.parseInt(schema.getFlop_bet());
			all += bet;
		}
		if (isNotEmpty(schema.getFlop_raise())) {
			raise = Integer.parseInt(schema.getFlop_raise());
			all += raise;
		}
		if (isNotEmpty(schema.getFlop_fold())) {
			fold = Integer.parseInt(schema.getFlop_fold());
			all += fold;
		}
		all = totalSchema.getFlop_all() + all;
		totalSchema.setFlop_all(all);
		totalSchema.setFlop_check(getRate(add(totalSchema.getFlop_check(), check), all));
		totalSchema.setFlop_call(getRate(add(totalSchema.getFlop_call(), call), all));
		totalSchema.setFlop_bet(getRate(add(totalSchema.getFlop_bet(), bet), all));
		totalSchema.setFlop_raise(getRate(add(totalSchema.getFlop_raise(), raise), all));
		totalSchema.setFlop_fold(getRate(add(totalSchema.getFlop_fold(), fold), all));

		int check_fold = 0;
		int check_call = 0;
		int check_raise = 0;
		int checkCount = 0;
		if (isNotEmpty(schema.getFlop_check_fold())) {
			check_fold = Integer.parseInt(schema.getFlop_check_fold());
			checkCount += check_fold;
		}
		if (isNotEmpty(schema.getFlop_check_call())) {
			check_call = Integer.parseInt(schema.getFlop_check_call());
			checkCount += check_call;
		}
		if (isNotEmpty(schema.getFlop_check_raise())) {
			check_raise = Integer.parseInt(schema.getFlop_check_raise());
			checkCount += check_raise;
		}
		if (checkCount > 0) {
			checkCount = totalSchema.getFlop_check_num() + checkCount;
			totalSchema.setFlop_check_num(checkCount);
			totalSchema.setFlop_check_fold(getRate(add(totalSchema.getFlop_check_fold(), check_fold), checkCount));
			totalSchema.setFlop_check_call(getRate(add(totalSchema.getFlop_check_call(), check_call), checkCount));
			totalSchema
					.setFlop_check_raise(getRate(add(totalSchema.getFlop_check_raise(), check_raise), checkCount));
		}
		
		int bet_fold = 0;
		int bet_call = 0;
		int bet_raise = 0;
		int betCount = 0;
		if (isNotEmpty(schema.getFlop_bet_fold())) {
			bet_fold = Integer.parseInt(schema.getFlop_bet_fold());
			betCount += bet_fold;
		}
		if (isNotEmpty(schema.getFlop_bet_call())) {
			bet_call = Integer.parseInt(schema.getFlop_bet_call());
			betCount += bet_call;
		}
		if (isNotEmpty(schema.getFlop_bet_raise())) {
			bet_raise = Integer.parseInt(schema.getFlop_bet_raise());
			betCount += bet_raise;
		}
		if (betCount > 0) {
			betCount = totalSchema.getFlop_bet_num() + betCount;
			totalSchema.setFlop_bet_num(betCount);
			totalSchema.setFlop_bet_fold(getRate(add(totalSchema.getFlop_bet_fold(), bet_fold), betCount));
			totalSchema.setFlop_bet_call(getRate(add(totalSchema.getFlop_bet_call(), bet_call), betCount));
			totalSchema.setFlop_bet_raise(getRate(add(totalSchema.getFlop_bet_raise(), bet_raise), betCount));
		}

		int raise_fold = 0;
		int raise_call = 0;
		int raise_raise = 0;
		int raiseCount = 0;
		if (isNotEmpty(schema.getFlop_raise_fold())) {
			raise_fold = Integer.parseInt(schema.getFlop_raise_fold());
			raiseCount += raise_fold;
		}
		if (isNotEmpty(schema.getFlop_raise_call())) {
			raise_call = Integer.parseInt(schema.getFlop_raise_call());
			raiseCount += raise_call;
		}
		if (isNotEmpty(schema.getFlop_raise_raise())) {
			raise_raise = Integer.parseInt(schema.getFlop_raise_raise());
			raiseCount += raise_raise;
		}
		if (raiseCount > 0) {
			raiseCount = totalSchema.getFlop_raise_num() + raiseCount;
			totalSchema.setFlop_raise_num(raiseCount);
			totalSchema
					.setFlop_raise_fold(getRate(add(totalSchema.getFlop_raise_fold(), raise_fold), raiseCount));
			totalSchema
					.setFlop_raise_call(getRate(add(totalSchema.getFlop_raise_call(), raise_call), raiseCount));
			totalSchema.setFlop_raise_raise(
					getRate(add(totalSchema.getFlop_raise_raise(), raise_raise), raiseCount));
		}

		return totalSchema;
	}

	private static TotalSchema saveTurn(TotalSchema totalSchema, TotalSchema schema) {
		int check = 0;
		int call = 0;
		int bet = 0;
		int raise = 0;
		int fold = 0;
		int all = 0;
		if (isNotEmpty(schema.getTurn_check())) {
			check = Integer.parseInt(schema.getTurn_check());
			all += check;
		}
		if (isNotEmpty(schema.getTurn_call())) {
			call = Integer.parseInt(schema.getTurn_call());
			all += call;
		}
		if (isNotEmpty(schema.getTurn_bet())) {
			bet = Integer.parseInt(schema.getTurn_bet());
			all += bet;
		}
		if (isNotEmpty(schema.getTurn_raise())) {
			raise = Integer.parseInt(schema.getTurn_raise());
			all += raise;
		}
		if (isNotEmpty(schema.getTurn_fold())) {
			fold = Integer.parseInt(schema.getTurn_fold());
			all += fold;
		}
		all = totalSchema.getTurn_all() + all;
		totalSchema.setTurn_all(all);
		totalSchema.setTurn_check(getRate(add(totalSchema.getTurn_check(), check), all));
		totalSchema.setTurn_call(getRate(add(totalSchema.getTurn_call(), call), all));
		totalSchema.setTurn_bet(getRate(add(totalSchema.getTurn_bet(), bet), all));
		totalSchema.setTurn_raise(getRate(add(totalSchema.getTurn_raise(), raise), all));
		totalSchema.setTurn_fold(getRate(add(totalSchema.getTurn_fold(), fold), all));

		int check_fold = 0;
		int check_call = 0;
		int check_raise = 0;
		int checkCount = 0;
		if (isNotEmpty(schema.getTurn_check_fold())) {
			check_fold = Integer.parseInt(schema.getTurn_check_fold());
			checkCount += check_fold;
		}
		if (isNotEmpty(schema.getTurn_check_call())) {
			check_call = Integer.parseInt(schema.getTurn_check_call());
			checkCount += check_call;
		}
		if (isNotEmpty(schema.getTurn_check_raise())) {
			check_raise = Integer.parseInt(schema.getTurn_check_raise());
			checkCount += check_raise;
		}
		if (checkCount > 0) {
			checkCount = totalSchema.getTurn_check_num() + checkCount;
			totalSchema.setTurn_check_num(checkCount);
			totalSchema.setTurn_check_fold(getRate(add(totalSchema.getTurn_check_fold(), check_fold), checkCount));
			totalSchema.setTurn_check_call(getRate(add(totalSchema.getTurn_check_call(), check_call), checkCount));
			totalSchema
					.setTurn_check_raise(getRate(add(totalSchema.getTurn_check_raise(), check_raise), checkCount));
		}
		
		int bet_fold = 0;
		int bet_call = 0;
		int bet_raise = 0;
		int betCount = 0;
		if (isNotEmpty(schema.getTurn_bet_fold())) {
			bet_fold = Integer.parseInt(schema.getTurn_bet_fold());
			betCount += bet_fold;
		}
		if (isNotEmpty(schema.getTurn_bet_call())) {
			bet_call = Integer.parseInt(schema.getTurn_bet_call());
			betCount += bet_call;
		}
		if (isNotEmpty(schema.getTurn_bet_raise())) {
			bet_raise = Integer.parseInt(schema.getTurn_bet_raise());
			betCount += bet_raise;
		}
		if (betCount > 0) {
			betCount = totalSchema.getTurn_bet_num() + betCount;
			totalSchema.setTurn_bet_num(betCount);
			totalSchema.setTurn_bet_fold(getRate(add(totalSchema.getTurn_bet_fold(), bet_fold), betCount));
			totalSchema.setTurn_bet_call(getRate(add(totalSchema.getTurn_bet_call(), bet_call), betCount));
			totalSchema.setTurn_bet_raise(getRate(add(totalSchema.getTurn_bet_raise(), bet_raise), betCount));
		}

		int raise_fold = 0;
		int raise_call = 0;
		int raise_raise = 0;
		int raiseCount = 0;
		if (isNotEmpty(schema.getTurn_raise_fold())) {
			raise_fold = Integer.parseInt(schema.getTurn_raise_fold());
			raiseCount += raise_fold;
		}
		if (isNotEmpty(schema.getTurn_raise_call())) {
			raise_call = Integer.parseInt(schema.getTurn_raise_call());
			raiseCount += raise_call;
		}
		if (isNotEmpty(schema.getTurn_raise_raise())) {
			raise_raise = Integer.parseInt(schema.getTurn_raise_raise());
			raiseCount += raise_raise;
		}
		if (raiseCount > 0) {
			raiseCount = totalSchema.getTurn_raise_num() + raiseCount;
			totalSchema.setTurn_raise_num(raiseCount);
			totalSchema
					.setTurn_raise_fold(getRate(add(totalSchema.getTurn_raise_fold(), raise_fold), raiseCount));
			totalSchema
					.setTurn_raise_call(getRate(add(totalSchema.getTurn_raise_call(), raise_call), raiseCount));
			totalSchema.setTurn_raise_raise(
					getRate(add(totalSchema.getTurn_raise_raise(), raise_raise), raiseCount));
		}

		return totalSchema;
	}
	
	private static TotalSchema saveRiver(TotalSchema totalSchema, TotalSchema schema) {
		int check = 0;
		int call = 0;
		int bet = 0;
		int raise = 0;
		int fold = 0;
		int all = 0;
		if (isNotEmpty(schema.getRiver_check())) {
			check = Integer.parseInt(schema.getRiver_check());
			all += check;
		}
		if (isNotEmpty(schema.getRiver_call())) {
			call = Integer.parseInt(schema.getRiver_call());
			all += call;
		}
		if (isNotEmpty(schema.getRiver_bet())) {
			bet = Integer.parseInt(schema.getRiver_bet());
			all += bet;
		}
		if (isNotEmpty(schema.getRiver_raise())) {
			raise = Integer.parseInt(schema.getRiver_raise());
			all += raise;
		}
		if (isNotEmpty(schema.getRiver_fold())) {
			fold = Integer.parseInt(schema.getRiver_fold());
			all += fold;
		}
		all = totalSchema.getRiver_all() + all;
		totalSchema.setRiver_all(all);
		totalSchema.setRiver_check(getRate(add(totalSchema.getRiver_check(), check), all));
		totalSchema.setRiver_call(getRate(add(totalSchema.getRiver_call(), call), all));
		totalSchema.setRiver_bet(getRate(add(totalSchema.getRiver_bet(), bet), all));
		totalSchema.setRiver_raise(getRate(add(totalSchema.getRiver_raise(), raise), all));
		totalSchema.setRiver_fold(getRate(add(totalSchema.getRiver_fold(), fold), all));

		int check_fold = 0;
		int check_call = 0;
		int check_raise = 0;
		int checkCount = 0;
		if (isNotEmpty(schema.getRiver_check_fold())) {
			check_fold = Integer.parseInt(schema.getRiver_check_fold());
			checkCount += check_fold;
		}
		if (isNotEmpty(schema.getRiver_check_call())) {
			check_call = Integer.parseInt(schema.getRiver_check_call());
			checkCount += check_call;
		}
		if (isNotEmpty(schema.getRiver_check_raise())) {
			check_raise = Integer.parseInt(schema.getRiver_check_raise());
			checkCount += check_raise;
		}
		if (checkCount > 0) {
			checkCount = totalSchema.getRiver_check_num() + checkCount;
			totalSchema.setRiver_check_num(checkCount);
			totalSchema.setRiver_check_fold(getRate(add(totalSchema.getRiver_check_fold(), check_fold), checkCount));
			totalSchema.setRiver_check_call(getRate(add(totalSchema.getRiver_check_call(), check_call), checkCount));
			totalSchema
					.setRiver_check_raise(getRate(add(totalSchema.getRiver_check_raise(), check_raise), checkCount));
		}
		
		int bet_fold = 0;
		int bet_call = 0;
		int bet_raise = 0;
		int betCount = 0;
		if (isNotEmpty(schema.getRiver_bet_fold())) {
			bet_fold = Integer.parseInt(schema.getRiver_bet_fold());
			betCount += bet_fold;
		}
		if (isNotEmpty(schema.getRiver_bet_call())) {
			bet_call = Integer.parseInt(schema.getRiver_bet_call());
			betCount += bet_call;
		}
		if (isNotEmpty(schema.getRiver_bet_raise())) {
			bet_raise = Integer.parseInt(schema.getRiver_bet_raise());
			betCount += bet_raise;
		}
		if (betCount > 0) {
			betCount = totalSchema.getRiver_bet_num() + betCount;
			totalSchema.setRiver_bet_num(betCount);
			totalSchema.setRiver_bet_fold(getRate(add(totalSchema.getRiver_bet_fold(), bet_fold), betCount));
			totalSchema.setRiver_bet_call(getRate(add(totalSchema.getRiver_bet_call(), bet_call), betCount));
			totalSchema.setRiver_bet_raise(getRate(add(totalSchema.getRiver_bet_raise(), bet_raise), betCount));
		}

		int raise_fold = 0;
		int raise_call = 0;
		int raise_raise = 0;
		int raiseCount = 0;
		if (isNotEmpty(schema.getRiver_raise_fold())) {
			raise_fold = Integer.parseInt(schema.getRiver_raise_fold());
			raiseCount += raise_fold;
		}
		if (isNotEmpty(schema.getRiver_raise_call())) {
			raise_call = Integer.parseInt(schema.getRiver_raise_call());
			raiseCount += raise_call;
		}
		if (isNotEmpty(schema.getRiver_raise_raise())) {
			raise_raise = Integer.parseInt(schema.getRiver_raise_raise());
			raiseCount += raise_raise;
		}
		if (raiseCount > 0) {
			raiseCount = totalSchema.getRiver_raise_num() + raiseCount;
			totalSchema.setRiver_raise_num(raiseCount);
			totalSchema
					.setRiver_raise_fold(getRate(add(totalSchema.getRiver_raise_fold(), raise_fold), raiseCount));
			totalSchema
					.setRiver_raise_call(getRate(add(totalSchema.getRiver_raise_call(), raise_call), raiseCount));
			totalSchema.setRiver_raise_raise(
					getRate(add(totalSchema.getRiver_raise_raise(), raise_raise), raiseCount));
		}

		return totalSchema;
	}
	
	
	private static TotalSchema savePerFlop(TotalSchema totalSchema, TotalSchema schema) {
		int limp = 0;
		int call = 0;
		int bet = 0;
		int raise = 0;
		int fold = 0;
		int all = 0;
		if (isNotEmpty(schema.getPer_flop_limp())) {
			limp = Integer.parseInt(schema.getPer_flop_limp());
			all += limp;
		}
		if (isNotEmpty(schema.getPer_flop_call())) {
			call = Integer.parseInt(schema.getPer_flop_call());
			all += call;
		}
		if (isNotEmpty(schema.getPer_flop_bet())) {
			bet = Integer.parseInt(schema.getPer_flop_bet());
			all += bet;
		}
		if (isNotEmpty(schema.getPer_flop_raise())) {
			raise = Integer.parseInt(schema.getPer_flop_raise());
			all += raise;
		}
		if (isNotEmpty(schema.getPer_flop_fold())) {
			fold = Integer.parseInt(schema.getPer_flop_fold());
			all += fold;
		}
		all = totalSchema.getPer_flop_all() + all;
		totalSchema.setPer_flop_all(all);
		totalSchema.setPer_flop_limp(getRate(add(totalSchema.getPer_flop_limp(), limp), all));
		totalSchema.setPer_flop_call(getRate(add(totalSchema.getPer_flop_call(), call), all));
		totalSchema.setPer_flop_bet(getRate(add(totalSchema.getPer_flop_bet(), bet), all));
		totalSchema.setPer_flop_raise(getRate(add(totalSchema.getPer_flop_raise(), raise), all));
		totalSchema.setPer_flop_fold(getRate(add(totalSchema.getPer_flop_fold(), fold), all));

		totalSchema.setVpip(getRate((convert(totalSchema.getPer_flop_limp()) + convert(totalSchema.getPer_flop_call())
				+ convert(totalSchema.getPer_flop_bet()) + convert(totalSchema.getPer_flop_raise())), all));
		totalSchema.setPfr(getRate((convert(totalSchema.getPer_flop_bet()) + convert(totalSchema.getPer_flop_raise())),all));

		int bet_fold = 0;
		int bet_call = 0;
		int bet_raise = 0;
		int betCount = 0;
		if (isNotEmpty(schema.getPer_flop_bet_fold())) {
			bet_fold = Integer.parseInt(schema.getPer_flop_bet_fold());
			betCount += bet_fold;
		}
		if (isNotEmpty(schema.getPer_flop_bet_call())) {
			bet_call = Integer.parseInt(schema.getPer_flop_bet_call());
			betCount += bet_call;
		}
		if (isNotEmpty(schema.getPer_flop_bet_raise())) {
			bet_raise = Integer.parseInt(schema.getPer_flop_bet_raise());
			betCount += bet_raise;
		}
		if (betCount > 0) {
			betCount = totalSchema.getPer_flop_bet_num() + betCount;
			totalSchema.setPer_flop_bet_num(betCount);
			totalSchema.setPer_flop_bet_fold(getRate(add(totalSchema.getPer_flop_bet_fold(), bet_fold), betCount));
			totalSchema.setPer_flop_bet_call(getRate(add(totalSchema.getPer_flop_bet_call(), bet_call), betCount));
			totalSchema.setPer_flop_bet_raise(getRate(add(totalSchema.getPer_flop_bet_raise(), bet_raise), betCount));
		}

		int call_fold = 0;
		int call_call = 0;
		int call_raise = 0;
		int callCount = 0;
		if (isNotEmpty(schema.getPer_flop_call_fold())) {
			call_fold = Integer.parseInt(schema.getPer_flop_call_fold());
			callCount += call_fold;
		}
		if (isNotEmpty(schema.getPer_flop_call_call())) {
			call_call = Integer.parseInt(schema.getPer_flop_call_call());
			callCount += call_call;
		}
		if (isNotEmpty(schema.getPer_flop_call_raise())) {
			call_raise = Integer.parseInt(schema.getPer_flop_call_raise());
			callCount += call_raise;
		}
		if (callCount > 0) {
			callCount = totalSchema.getPer_flop_call_num() + callCount;
			totalSchema.setPer_flop_call_num(callCount);
			totalSchema.setPer_flop_call_fold(getRate(add(totalSchema.getPer_flop_call_fold(), call_fold), callCount));
			totalSchema.setPer_flop_call_call(getRate(add(totalSchema.getPer_flop_call_call(), call_call), callCount));
			totalSchema
					.setPer_flop_call_raise(getRate(add(totalSchema.getPer_flop_call_raise(), call_raise), callCount));
		}

		int limp_fold = 0;
		int limp_call = 0;
		int limp_raise = 0;
		int limpCount = 0;
		if (isNotEmpty(schema.getPer_flop_limp_fold())) {
			limp_fold = Integer.parseInt(schema.getPer_flop_limp_fold());
			limpCount += limp_fold;
		}
		if (isNotEmpty(schema.getPer_flop_limp_call())) {
			limp_call = Integer.parseInt(schema.getPer_flop_limp_call());
			limpCount += limp_call;
		}
		if (isNotEmpty(schema.getPer_flop_limp_raise())) {
			limp_raise = Integer.parseInt(schema.getPer_flop_limp_raise());
			limpCount += limp_raise;
		}
		if (limpCount > 0) {
			limpCount = totalSchema.getPer_flop_limp_num() + limpCount;
			totalSchema.setPer_flop_limp_num(limpCount);
			totalSchema.setPer_flop_limp_fold(getRate(add(totalSchema.getPer_flop_limp_fold(), limp_fold), limpCount));
			totalSchema.setPer_flop_limp_call(getRate(add(totalSchema.getPer_flop_limp_call(), limp_call), limpCount));
			totalSchema
					.setPer_flop_limp_raise(getRate(add(totalSchema.getPer_flop_limp_raise(), limp_raise), limpCount));
		}

		int raise_fold = 0;
		int raise_call = 0;
		int raise_raise = 0;
		int raiseCount = 0;
		if (isNotEmpty(schema.getPer_flop_raise_fold())) {
			raise_fold = Integer.parseInt(schema.getPer_flop_raise_fold());
			raiseCount += raise_fold;
		}
		if (isNotEmpty(schema.getPer_flop_raise_call())) {
			raise_call = Integer.parseInt(schema.getPer_flop_raise_call());
			raiseCount += raise_call;
		}
		if (isNotEmpty(schema.getPer_flop_raise_raise())) {
			raise_raise = Integer.parseInt(schema.getPer_flop_raise_raise());
			raiseCount += raise_raise;
		}
		if (raiseCount > 0) {
			raiseCount = totalSchema.getPer_flop_raise_num() + raiseCount;
			totalSchema.setPer_flop_raise_num(raiseCount);
			totalSchema
					.setPer_flop_raise_fold(getRate(add(totalSchema.getPer_flop_raise_fold(), raise_fold), raiseCount));
			totalSchema
					.setPer_flop_raise_call(getRate(add(totalSchema.getPer_flop_raise_call(), raise_call), raiseCount));
			totalSchema.setPer_flop_raise_raise(
					getRate(add(totalSchema.getPer_flop_raise_raise(), raise_raise), raiseCount));
		}

		return totalSchema;
	}

	private static boolean isNotEmpty(String str) {
		if (str == null || str.length() <= 0) {
			return false;
		}
		return true;
	}

	private static int convert(String str) {
		if (isNotEmpty(str)) {
			return Integer.parseInt(str.split(",")[0]);
		}
		return 0;
	}

	private static int add(String str, int count) {
		if (isNotEmpty(str)) {
			return Integer.parseInt(str.split(",")[0]) + count;
		}
		return count;
	}

	private static String getRate(int count, int all) {
		if (count == 0 || all == 0) {
			return "0,0%";
		}
		DecimalFormat df = new DecimalFormat("0.00");
		String result = df.format(count * 100 / (float) all);
		return count + "," + result + "%";
	}

}
