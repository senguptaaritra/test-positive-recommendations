
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.amazonaws.services.ec2.model.DescribeImagesResult;
import com.amazonaws.services.ec2.model.Filter;

public class TestAmiSniping {

    private static final String AMI_AUTOMATON = "amiDescribeImageRequest_V1";
    private static final String IMG_NAME = "some_linux_img";

    public static void inCorrect(AmazonEC2    client) {
        DescribeImagesRequest  request = new DescribeImagesRequest();
        //request.withFilters(new Filter("name").withValues(IMG_NAME));
        //request.withOwners("amazon");
        DescribeImagesResult result = client.describeImages(request);
    }

    public static void correct(AmazonEC2    client) {
        DescribeImagesRequest  request = new DescribeImagesRequest();
        request.withFilters(new Filter("name").withValues(IMG_NAME));
        request.withOwners("amazon");
        DescribeImagesResult result = client.describeImages(request);
    }
}
