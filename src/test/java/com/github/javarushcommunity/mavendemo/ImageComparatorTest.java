package com.github.javarushcommunity.mavendemo;

import com.github.romankh3.image.comparison.ImageComparisonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Unit-level testing for ImageComparator")
class ImageComparatorTest {
    private final ImageComparator comparator = new ImageComparator();

    @Test
    public void shouldConfirmImagesNotTheSame() {
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("image1.png");
        BufferedImage image2 = ImageComparisonUtil.readImageFromResources("image2.png");
        boolean theSameImages = comparator.isTheSameImages(image1, image2);
        Assertions.assertFalse(theSameImages);
    }

    @Test
    public void shouldConfirmImagesTheSame() {
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("image1.png");
        boolean theSameImages = comparator.isTheSameImages(image1, image1);
        Assertions.assertTrue(theSameImages);
    }
}