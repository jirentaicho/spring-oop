package com.volkruss.deposit.infrastructure.repository.ordinary;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.volkruss.deposit.domain.entity.deposit.ordinary.OrdinaryDeposit;
import com.volkruss.deposit.domain.repository.ordinary.OrdinaryDsModel;
import com.volkruss.deposit.domain.repository.ordinary.OrdinaryRepository;

@Component
public class OrdinaryRepositoryImpl implements OrdinaryRepository{
	
	private Map<Integer, OrdinaryDsModel> database = new HashMap<>();
	
	// データベースのレコードはEntityに関与しない
	public OrdinaryRepositoryImpl() {
		this.database.put(1, new OrdinaryDsModel("御坂美琴", 1, 9999, LocalDate.of(2022, 5, 12)));
		this.database.put(2, new OrdinaryDsModel("白井黒子", 2, 8888, LocalDate.of(2022, 4, 11)));
		this.database.put(3, new OrdinaryDsModel("佐天涙子", 3, 7777, LocalDate.of(2022, 3, 10)));
		this.database.put(4, new OrdinaryDsModel("初春飾利", 4, 6666, LocalDate.of(2022, 2, 9)));
	}

	@Override
	public OrdinaryDeposit findById(int id) {
		OrdinaryDsModel result = this.database.get(id);
		// ここで返すのをEntityにしている
		OrdinaryDeposit deposit = new OrdinaryDeposit(result.accountName,result.accountNumber);
		deposit.setAmount(result.amount);
		deposit.setWithdrawDate(result.withdrawDate);
		return deposit;
	}	
	
}
