package pcf.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pcf.demo.bean.TeamBean;
import pcf.demo.controller.HomeController;
import pcf.demo.service.TeamServiceImpl;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {PracticeApplication.class})
@WebMvcTest(controllers = HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private TeamServiceImpl teamService;

    @Test
    public void test_getAllTeams() throws Exception {
        List<TeamBean> teamBean = TestUtil.createTeamBeanList();
        List<TeamBean> teamList = Lists.newArrayList(TestUtil.createTeamBean());
        Mockito.when(teamService.getAll()).thenReturn(teamBean);
        MockHttpServletResponse response = TestUtil.getMockHttpServletResponse("/teams", mockMvc);
        assertEquals(objectMapper.writeValueAsString(teamList), response.getContentAsString());
    }
}
