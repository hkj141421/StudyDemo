package FrameWork.Service;

import FrameWork.bean.Music;

/**
 * Created by forget on 2019/6/5.
 */
public interface MusicService {
    void setMusic(Music music);
    Music getMusic(Music music);
    void listenMusic();
}
