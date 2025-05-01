package kr.or.human7;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileController {

	@RequestMapping("/view")
	public String view() {

		return "view";
	}

	@RequestMapping("/upload")
	public String upload(MultipartHttpServletRequest req) throws UnsupportedEncodingException {

		req.setCharacterEncoding("utf-8");
		// Multipar 첨부파일
		// Multipar 로 보내고
		// HttpServletRequest로 받았다면
		// getParameter로 가져올 수 없지만
		// MultipartHttpServletRequest는 됨
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title: " + title);
		System.out.println("content: " + content);

		// 파일 처리
		MultipartFile mf = req.getFile("file1");

		long fileSize = mf.getSize();
		System.out.println("fileSize: " + fileSize);

		String fileName = mf.getOriginalFilename();
		System.out.println("fileName: " + fileName);

		try {
			String path = "C:\\temp\\upload";
			String safeFileName = path + "\\" + System.currentTimeMillis() + "_" + fileName;
			System.out.println("safeFileName: " + safeFileName);
			File file = new File(safeFileName);

			mf.transferTo(file);
			// 실제파일을 file 경로와 이름으로 저장해라

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redirect:view";
	}

	// 파일 업로드 한번에 여러개 가능
	@RequestMapping("/uploads")
	public String uploads(MultipartHttpServletRequest req) throws UnsupportedEncodingException {

		req.setCharacterEncoding("utf-8");
		// Multipar 첨부파일
		// Multipar 로 보내고
		// HttpServletRequest로 받았다면
		// getParameter로 가져올 수 없지만
		// MultipartHttpServletRequest는 됨
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title: " + title);
		System.out.println("content: " + content);

		// 파일 처리
//		MultipartFile mf = req.getFile("file1");
		List<MultipartFile> fileList = req.getFiles("file1");

		for (MultipartFile mf : fileList) {
			long fileSize = mf.getSize();
			System.out.println("fileSize: " + fileSize);

			String fileName = mf.getOriginalFilename();
			System.out.println("fileName: " + fileName);

			try {
				String path = "C:\\temp\\upload";
				String safeFileName = path + "\\" + System.currentTimeMillis() + "_" + fileName;
				System.out.println("safeFileName: " + safeFileName);
				File file = new File(safeFileName);

				mf.transferTo(file);
				// 실제파일을 file 경로와 이름으로 저장해라

			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return "redirect:view";
	}

}
