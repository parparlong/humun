package kr.or.human3.dao;

import java.util.List;

import kr.or.human3.dto.WebttonDTO;

public interface WebtoonDao {

	List selectList();
	
	void update(WebttonDTO webttonDTO);
	
	void insert(WebttonDTO webttonDTO);
	
	void delete(WebttonDTO webttonDTO);


}
