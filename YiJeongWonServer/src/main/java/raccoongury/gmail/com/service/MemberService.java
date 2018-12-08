package raccoongury.gmail.com.service;

import javax.servlet.http.HttpServletRequest;

import raccoongury.gmail.com.domain.Member;

public interface MemberService {
	//로그인을 처리하기 위한 메소드
		public Member login(HttpServletRequest request);
	}
