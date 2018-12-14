package pcf.demo;

import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pcf.demo.bean.TeamBean;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {

    public static MockHttpServletResponse getMockHttpServletResponse(String url, MockMvc mockMvc) throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                url).accept(
                MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        return result.getResponse();
    }

    public static MockHttpServletResponse deleteMockHttpServletResponse(String url, MockMvc mockMvc) throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.delete(
                url).accept(
                MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        return result.getResponse();
    }

    public static MockHttpServletResponse putMockHttpServletResponse(String url, MockMvc mockMvc, String obj) throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.put(
                url, obj).accept(
                MediaType.APPLICATION_JSON)
                .content(obj)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        return result.getResponse();
    }

    public static MockHttpServletResponse postMockHttpServletResponse(String url, MockMvc mockMvc, String obj) throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                url, obj)
                .accept(MediaType.APPLICATION_JSON)
                .content(obj)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        return result.getResponse();
    }

    public static TeamBean createTeamBean() {
        TeamBean teamBean = new TeamBean();
        teamBean.setId(1);
        teamBean.setTeamName("test team");
        return teamBean;
    }

    public static List<TeamBean> createTeamBeanList() {
        List<TeamBean> beanList = new ArrayList<>();
        beanList.add(createTeamBean());
        return beanList;
    }
}
