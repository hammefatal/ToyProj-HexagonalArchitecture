package hammefatal.toyproj.membership.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {

    @Getter
    private final String membershipId;
    @Getter
    private final String name;
    @Getter
    private final String email;
    @Getter
    private final String address;
    @Getter
    private final boolean isValid;
    @Getter
    private final String aggregateIdentifier;

    public static Membership generateMember(
            MembershipId membershipId, MembershipName membershipName, MembershipEmail membershipEmail,
            MembershipAddress membershipAddress, MembershipIsValid membershipIsValid, MembershipAggregateIdentifier membershipAggregateIdentifier
    ) {
        return new Membership(
                membershipId.membershipId,
                membershipName.membershipName,
                membershipEmail.membershipEmail,
                membershipAddress.membershipAddress,
                membershipIsValid.membershipIsValid,
                membershipAggregateIdentifier.aggregatIdentifier
        );
    }

    @Value
    public static class MembershipId {
        private String membershipId;

        public MembershipId(String membershipId) {
            this.membershipId = membershipId;
        }
    }

    @Value
    public static class MembershipName {
        private String membershipName;

        public MembershipName(String membershipName) {
            this.membershipName = membershipName;
        }
    }

    @Value
    public static class MembershipEmail {
        public MembershipEmail(String value) {
            this.membershipEmail = value;
        }
        String membershipEmail;
    }

    @Value
    public static class MembershipAddress {
        public MembershipAddress(String value) {
            this.membershipAddress = value;
        }
        String membershipAddress;
    }

    @Value
    public static class MembershipIsValid {
        public MembershipIsValid(boolean value) {
            this.membershipIsValid = value;
        }
        boolean membershipIsValid;
    }

    @Value
    public static class MembershipAggregateIdentifier {
        public MembershipAggregateIdentifier(String value) {
            this.aggregatIdentifier = value;
        }
        String aggregatIdentifier;
    }

}
