package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("10퍼센트 할인이 적용되어야 한다")
    void vip_o() {
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);

        //when
        int disCount = discountPolicy.discount(member, 10000);

        //then
        assertThat(disCount).isEqualTo(1000);
    }

    @Test
    @DisplayName("Vip가 아니면 할인 적용x")
    void vip_x() {
        Member member = new Member(2L, "memberBasic", Grade.BASIC);

        int disCount = discountPolicy.discount(member, 10000);

        assertThat(disCount).isEqualTo(0);
    }

}