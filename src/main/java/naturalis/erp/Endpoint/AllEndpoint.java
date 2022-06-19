package naturalis.erp.Endpoint;

import localhost.teste.*;
import naturalis.erp.Model.PlayList;
import naturalis.erp.Service.MusicService;
import naturalis.erp.Service.PlayListService;
import naturalis.erp.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class AllEndpoint {

    private static final String NAMESPACE_URI = "http://localhost/teste";

    @Autowired
    private UserService userService;

    @Autowired
    private MusicService musicService;

    @Autowired
    private PlayListService playListService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllUsersRequest")
    @ResponsePayload
    public GetAllUsersResponse getAllUsersResponse(@RequestPayload GetAllUsersRequest request){
        GetAllUsersResponse response = new GetAllUsersResponse();
        List<User> userList = new ArrayList<>();
        List<naturalis.erp.Model.User> userTeste = userService.getAllUsers();

        userTeste.forEach(e -> {
            User user = new User();
            BeanUtils.copyProperties(e, user);
            userList.add(user);
        });

        response.getUser().addAll(userList);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllMusicsRequest")
    @ResponsePayload
    public GetAllMusicsResponse getAllMusicsResponse(@RequestPayload GetAllMusicsRequest request){
        GetAllMusicsResponse response = new GetAllMusicsResponse();
        List<Music> musicList = new ArrayList<>();
        List<naturalis.erp.Model.Music> music = musicService.getAllMusics();

        music.forEach(m -> {
            Music musicModel = new Music();
            BeanUtils.copyProperties(m, musicModel);
            musicList.add(musicModel);
        });

        response.getMusic().addAll(musicList);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPlayRequest")
    @ResponsePayload
    public GetPlaysResponse getAllPlayResponse(@RequestPayload GetPlayRequest request){
        GetPlaysResponse response = new GetPlaysResponse();
        List<Playlist> play = new ArrayList<>();
        List<PlayList> p = playListService.getPlayListByUserId(request.getUserId());

        p.forEach(l -> {
            Playlist pp = new Playlist();
            BeanUtils.copyProperties(l, pp);
            play.add(pp);
        });

        response.getPlaylist().addAll(play);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllPlayRequest")
    @ResponsePayload
    public GetAllPlayResponse getAllPlayResponse(@RequestPayload GetAllPlayRequest request){
        GetAllPlayResponse response = new GetAllPlayResponse();
        List<Playlist> playlists = new ArrayList<>();
        List<PlayList> p = playListService.getAllPlayList();

        p.forEach(l -> {
            Playlist pp = new Playlist();
            BeanUtils.copyProperties(l, pp);
            playlists.add(pp);
        });

        response.getPlaylist().addAll(playlists);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPlayByMusicRequest")
    @ResponsePayload
    public GetPlayByMusicResponse getPlayByMusicResponse(@RequestPayload GetPlayByMusicRequest request){
        GetPlayByMusicResponse response = new GetPlayByMusicResponse();
        List<Playlist> play = new ArrayList<>();
        var music = playListService.getPlayListsByMusic(request.getId());

        music.forEach(m -> {
            Playlist pp = new Playlist();
            BeanUtils.copyProperties(m, pp);
            play.add(pp);
        });

        response.getPlaylist().addAll(play);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllMusicByPlayListRequest")
    @ResponsePayload
    public GetAllMusicByPlayListResponse getAllMusicByPlayListResponse(@RequestPayload GetAllMusicByPlayListRequest request){
        GetAllMusicByPlayListResponse response = new GetAllMusicByPlayListResponse();
        List<Music> musics = new ArrayList<>();
        var playlistId = musicService.getAllMusicsByPlayList(request.getId());

        playlistId.forEach(p -> {
            Music ms = new Music();
            BeanUtils.copyProperties(p, ms);
            musics.add(ms);
        });

        response.getMusic().addAll(musics);
        return response;
    }
}
