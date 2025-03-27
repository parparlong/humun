package kr.or.human3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human3.dao.WebtoonDaoImpl;
import kr.or.human3.dto.WebttonDTO;

@Service
public class WebtoonServiceImpl implements WebtoonService{
	@Autowired
	WebtoonDaoImpl webtoonDaoImpl;
	
	@Override
	public List getList() {
		System.out.println("WebtoonServiceImpl 실행 getList");
		List list = webtoonDaoImpl.selectList();
		return list;
	}

	@Override
	public void insert(WebttonDTO webttonDTO) {
		System.out.println("WebtoonServiceImpl 실행 insert");
		webttonDTO.getImg_link();
		webttonDTO.getTitle();
		webttonDTO.getAuthor();
		webttonDTO.getExplanation();
//		WebtoonDaoImpl webtoonDaoImpl = new WebtoonDaoImpl();
		webtoonDaoImpl.insert(webttonDTO);
	
	}

	
}
