package com.bdid.bdid;

import com.bdid.bdid.repository.MemberRepository;
import com.bdid.bdid.repository.MemoryMemberRepository;
import com.bdid.bdid.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
