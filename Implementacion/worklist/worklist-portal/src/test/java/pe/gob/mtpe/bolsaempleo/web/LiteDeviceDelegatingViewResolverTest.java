package pe.gob.mtpe.bolsaempleo.web;


import java.util.Locale;
import org.springframework.mobile.device.view.LiteDeviceDelegatingViewResolver;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

/**
 *
 * @author USUARIO
 */
public class LiteDeviceDelegatingViewResolverTest {
    private LiteDeviceDelegatingViewResolver viewResolver;
    private ViewResolver delegateViewResolver;
    private View view;

	private MockHttpServletRequest request = new MockHttpServletRequest();

//	private StubDevice device = new StubDevice();

	private String viewName = "home";

	private final Locale locale = Locale.ENGLISH;
        /*
        @Before
	public void setUp() {
		          StaticWebApplicationContext context = new StaticWebApplicationContext();
		context.setServletContext(new MockServletContext());
		context.refresh();
		this.delegateViewResolver = createMock(ViewResolver.class);
		this.viewResolver = new LiteDeviceDelegatingViewResolver(delegateViewResolver);
		viewResolver.setApplicationContext(context);
		request.setRequestURI("/home");
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		this.view = createMock("view", View.class);
	}

	@After
	public void tearDown() throws Exception {
		RequestContextHolder.resetRequestAttributes();
	}*/
}
