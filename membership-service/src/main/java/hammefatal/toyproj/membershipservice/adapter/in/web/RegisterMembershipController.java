package hammefatal.toyproj.membershipservice.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterMembershipController {

    @GetMapping("/membership/test")
    public void test() {
        System.out.println("/membership/test.....");
    }

}
