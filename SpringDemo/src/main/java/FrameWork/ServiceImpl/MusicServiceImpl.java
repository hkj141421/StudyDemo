package FrameWork.ServiceImpl;

import FrameWork.Service.MusicService;
import FrameWork.bean.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by forget on 2019/6/5.
 */
@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private Music music;

    @Override
    public void setMusic(Music music) {
//        this.music=music;
        System.out.println("设置音乐信息");
    }

    @Override
    public Music getMusic(Music music) {
            return this.music;
    }

    @Override
    public void listenMusic() {
        System.out.println("正在收听音乐"+this.music);
    }
}
