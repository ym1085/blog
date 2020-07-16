package com.cos.blog.service;import com.cos.blog.model.Board;import com.cos.blog.model.RoleType;import com.cos.blog.model.User;import com.cos.blog.repository.BoardRepository;import com.cos.blog.repository.UserRepository;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.data.domain.Page;import org.springframework.data.domain.Pageable;import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import java.util.List;@Service// 스프링이 컴포넌트 스캔을 통해서 bean에 등록public class BoardService {   @Autowired   private BoardRepository boardRepository;   @Transactional  //성공하면 1 실패하면 rollback   public void 글쓰기(Board board, User user){      board.setCount(0);      board.setUser(user);      boardRepository.save(board);   }   //글목록 보여주기.   public Page<Board> 글목록(Pageable pageble){      return boardRepository.findAll(pageble);   }   //글목록 보여주기.   public Board 글상세보기(int id){      return boardRepository.findById(id)             .orElseThrow(()->{                return new IllegalArgumentException("글 상세보기 실패 : 아이디를 찾을 수 없습니다.");      });   }}