package com.example.mild.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MildListDto {
    private int musicNum;
    private int categoryNum;
    private String musicTitle;
    private String munsicTitleImg;
    private String musicArtist;
    private String munsicGenre;
    private String musicAlbum;
    private int musicRank;
    private int musicLike;
    private LocalDateTime regdateTime;
    private LocalDateTime moddateTime;

    public int getMusicNum() {
        return this.musicNum;
    }

    public void setMusicNum(int musicNum) {
        this.musicNum = musicNum;
    }

    public int getCategoryNum() {
        return this.categoryNum;
    }

    public void setCategoryNum(int categoryNum) {
        this.categoryNum = categoryNum;
    }

    public String getMusicTitle() {
        return this.musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
        this.musicTitle = musicTitle;
    }

    public String getMunsicTitleImg() {
        return this.munsicTitleImg;
    }

    public void setMunsicTitleImg(String munsicTitleImg) {
        this.munsicTitleImg = munsicTitleImg;
    }

    public String getMusicArtist() {
        return this.musicArtist;
    }

    public void setMusicArtist(String musicArtist) {
        this.musicArtist = musicArtist;
    }

    public String getMunsicGenre() {
        return this.munsicGenre;
    }

    public void setMunsicGenre(String munsicGenre) {
        this.munsicGenre = munsicGenre;
    }

    public String getMusicAlbum() {
        return this.musicAlbum;
    }

    public void setMusicAlbum(String musicAlbum) {
        this.musicAlbum = musicAlbum;
    }

    public int getMusicRank() {
        return this.musicRank;
    }

    public void setMusicRank(int musicRank) {
        this.musicRank = musicRank;
    }

    public int getMusicLike() {
        return this.musicLike;
    }

    public void setMusicLike(int musicLike) {
        this.musicLike = musicLike;
    }

    public LocalDateTime getRegdateTime() {
        return this.regdateTime;
    }

    public void setRegdateTime(LocalDateTime regdateTime) {
        this.regdateTime = regdateTime;
    }

    public LocalDateTime getModdateTime() {
        return this.moddateTime;
    }

    public void setModdateTime(LocalDateTime moddateTime) {
        this.moddateTime = moddateTime;
    }

}


