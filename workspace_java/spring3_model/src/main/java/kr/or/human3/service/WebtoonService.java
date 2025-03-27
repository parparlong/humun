package kr.or.human3.service;

import java.util.List;

import kr.or.human3.dto.WebttonDTO;




public interface WebtoonService {

	List getList();
	
	void insert(WebttonDTO webttonDTO);
}
