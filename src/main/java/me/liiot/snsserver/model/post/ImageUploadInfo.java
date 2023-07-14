package me.liiot.snsserver.model.post;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ImageUploadInfo {

    private int postId;

    private String imageName;

    private String imagePath;

    private int seq;
}
