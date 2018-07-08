package com.sample.github.user;

import com.sample.github.model.Email;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyLong;

@RunWith(MockitoJUnitRunner.class)
public class UserFindServiceTest {

    @InjectMocks
    private UserFindService userFindService;

    @Mock
    private UserRepository userRepository;


    @Test
    public void findById_유저가있을경우_해당유저리턴() {
        //given
        final User user = buildUser();
        given(userRepository.findOne(anyLong())).willReturn(user);

        //when
        final User findUser = userFindService.findById(anyLong());

        //then
        assertThat(findUser.getEmail().getValue(), is(user.getEmail().getValue()));
    }

    @Test(expected = RuntimeException.class)
    public void findById_유저가존재하지않는경우() {
        //given
        given(userRepository.findOne(anyLong())).willReturn(null);

        //when
        userFindService.findById(anyLong());

    }

    private User buildUser() {
        return User.builder()
                .email(Email.builder().value("yun@test.com").build())
                .build();
    }
}