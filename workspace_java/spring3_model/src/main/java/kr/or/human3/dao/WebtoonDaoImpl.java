package kr.or.human3.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.human3.dto.WebttonDTO;

@Repository("/WebtoonDaoImpl")
public class WebtoonDaoImpl implements WebtoonDao{

	
	List<WebttonDTO> list = new ArrayList<WebttonDTO>();
	WebttonDTO webttonDTO = new WebttonDTO();
	int count = 0;
	
	@Override
	public List selectList() {
		System.out.println("WebtoonDaoImpl 실행 selectList");
		if(count == 0) {
			count++;
			webttonDTO.setNumber(count);
			webttonDTO.setImg_link("https://image-comic.pstatic.net/webtoon/837486/thumbnail/thumbnail_IMAG21_fb9d2340-c0e1-4d42-a9a6-1f1e694c56e0.jpg");
			webttonDTO.setTitle("귀멸에칼날");
			webttonDTO.setAuthor("킁왕이");
			webttonDTO.setExplanation("해당 웹툰에 설명란입니다. 확인해주세요");
			list.add(webttonDTO);
			for(int i=0; i<list.size();i++) {
			System.out.println("list selectList"+list.get(i));
			}
		}
		
		return list;
	}

	@Override
	public void update(WebttonDTO webttonDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(WebttonDTO webttonDTO) {
		System.out.println("WebtoonDaoImpl 실행 insert");
		list.add(webttonDTO);
		System.out.println("list.size"+list.size());
		for(int i=0; i<list.size();i++) {
			System.out.println("list insert"+list.get(i));
		}
		
	}

	@Override
	public void delete(WebttonDTO webttonDTO) {

		list.remove(webttonDTO);
		
	}

	
}
