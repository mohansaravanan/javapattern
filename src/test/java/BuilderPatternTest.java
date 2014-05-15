import com.papcloud.javapattern.builder.User;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by mohan.saravanan on 15/05/2014.
 */
public class BuilderPatternTest {


    @Test
    public void shouldBuildUserObject() throws Exception {
        //given
        String firstName = "Mohan";
        String lastName = "Saravanan";
        String address = "London, UB3";
        int age = 38;
        String phone = "07564333333";

        //when
        User user = new User.UserBuilder(firstName, lastName).withAddress(address).withAge(age).withPhone(phone).build();

        //then
        assertThat(user.getFirstName(), is(firstName));
        assertThat(user.getLastName(), is(lastName));
        assertThat(user.getAddress(), is(address));
        assertThat(user.getAge(), is(age));
        assertThat(user.getPhone(), is(phone));

    }

}
