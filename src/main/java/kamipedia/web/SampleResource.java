package kamipedia.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( "sample" )
public class SampleResource
{
    @RequestMapping( value = "", method = RequestMethod.GET )
    public String customers()
    {
        String sample = "sample";

        return sample;
    }
}
