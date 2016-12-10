package com.blackjacksmart.reddragon.midtermassessmentapp.network.POJOS;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by RedDragon on 12/10/16.
 */

public class Record {

    @SerializedName("liked")
    @Expose
    private long liked;
    @SerializedName("videoDashUrl")
    @Expose
    private String videoDashUrl;
    @SerializedName("foursquareVenueId")
    @Expose
    private String foursquareVenueId;
    @SerializedName("remixDisabled")
    @Expose
    private long remixDisabled;
    @SerializedName("userId")
    @Expose
    private long userId;
    @SerializedName("private")
    @Expose
    private long _private;
    @SerializedName("videoWebmUrl")
    @Expose
    private Object videoWebmUrl;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;
    @SerializedName("explicitContent")
    @Expose
    private long explicitContent;
    @SerializedName("verified")
    @Expose
    private long verified;
    @SerializedName("avatarUrl")
    @Expose
    private String avatarUrl;
    @SerializedName("entities")
    @Expose
    private List<Object> entities = null;
    @SerializedName("videoLowURL")
    @Expose
    private String videoLowURL;
    @SerializedName("vanityUrls")
    @Expose
    private List<String> vanityUrls = null;
    @SerializedName("blocked")
    @Expose
    private long blocked;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("permalinkUrl")
    @Expose
    private String permalinkUrl;
    @SerializedName("promoted")
    @Expose
    private long promoted;
    @SerializedName("postId")
    @Expose
    private long postId;
    @SerializedName("profileBackground")
    @Expose
    private String profileBackground;
    @SerializedName("videoUrl")
    @Expose
    private String videoUrl;
    @SerializedName("followRequested")
    @Expose
    private long followRequested;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("hasSimilarPosts")
    @Expose
    private long hasSimilarPosts;
    @SerializedName("shareUrl")
    @Expose
    private String shareUrl;
    @SerializedName("myRepostId")
    @Expose
    private long myRepostId;
    @SerializedName("following")
    @Expose
    private long following;
    @SerializedName("hasRemixes")
    @Expose
    private long hasRemixes;
    @SerializedName("venueCategoryId")
    @Expose
    private String venueCategoryId;
    @SerializedName("venueName")
    @Expose
    private String venueName;
    @SerializedName("venueCategoryShortName")
    @Expose
    private String venueCategoryShortName;
    @SerializedName("venueCity")
    @Expose
    private String venueCity;
    @SerializedName("venueCountryCode")
    @Expose
    private String venueCountryCode;
    @SerializedName("venueState")
    @Expose
    private String venueState;
    @SerializedName("venueAddress")
    @Expose
    private String venueAddress;
    @SerializedName("venueCategoryIconUrl")
    @Expose
    private String venueCategoryIconUrl;

    /**
     * @return The liked
     */
    public long getLiked() {
        return liked;
    }

    /**
     * @param liked The liked
     */
    public void setLiked(long liked) {
        this.liked = liked;
    }

    /**
     * @return The videoDashUrl
     */
    public String getVideoDashUrl() {
        return videoDashUrl;
    }

    /**
     * @param videoDashUrl The videoDashUrl
     */
    public void setVideoDashUrl(String videoDashUrl) {
        this.videoDashUrl = videoDashUrl;
    }

    /**
     * @return The foursquareVenueId
     */
    public String getFoursquareVenueId() {
        return foursquareVenueId;
    }

    /**
     * @param foursquareVenueId The foursquareVenueId
     */
    public void setFoursquareVenueId(String foursquareVenueId) {
        this.foursquareVenueId = foursquareVenueId;
    }

    /**
     * @return The remixDisabled
     */
    public long getRemixDisabled() {
        return remixDisabled;
    }

    /**
     * @param remixDisabled The remixDisabled
     */
    public void setRemixDisabled(long remixDisabled) {
        this.remixDisabled = remixDisabled;
    }

    /**
     * @return The userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId The userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * @return The _private
     */
    public long getPrivate() {
        return _private;
    }

    /**
     * @param _private The private
     */
    public void setPrivate(long _private) {
        this._private = _private;
    }

    /**
     * @return The videoWebmUrl
     */
    public Object getVideoWebmUrl() {
        return videoWebmUrl;
    }

    /**
     * @param videoWebmUrl The videoWebmUrl
     */
    public void setVideoWebmUrl(Object videoWebmUrl) {
        this.videoWebmUrl = videoWebmUrl;
    }



    /**
     * @return The thumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * @param thumbnailUrl The thumbnailUrl
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * @return The explicitContent
     */
    public long getExplicitContent() {
        return explicitContent;
    }

    /**
     * @param explicitContent The explicitContent
     */
    public void setExplicitContent(long explicitContent) {
        this.explicitContent = explicitContent;
    }

    /**
     * @return The verified
     */
    public long getVerified() {
        return verified;
    }

    /**
     * @param verified The verified
     */
    public void setVerified(long verified) {
        this.verified = verified;
    }

    /**
     * @return The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl The avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return The entities
     */
    public List<Object> getEntities() {
        return entities;
    }

    /**
     * @param entities The entities
     */
    public void setEntities(List<Object> entities) {
        this.entities = entities;
    }

    /**
     * @return The videoLowURL
     */
    public String getVideoLowURL() {
        return videoLowURL;
    }

    /**
     * @param videoLowURL The videoLowURL
     */
    public void setVideoLowURL(String videoLowURL) {
        this.videoLowURL = videoLowURL;
    }

    /**
     * @return The vanityUrls
     */
    public List<String> getVanityUrls() {
        return vanityUrls;
    }

    /**
     * @param vanityUrls The vanityUrls
     */
    public void setVanityUrls(List<String> vanityUrls) {
        this.vanityUrls = vanityUrls;
    }

    /**
     * @return The blocked
     */
    public long getBlocked() {
        return blocked;
    }

    /**
     * @param blocked The blocked
     */
    public void setBlocked(long blocked) {
        this.blocked = blocked;
    }

    /**
     * @return The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * @return The permalinkUrl
     */
    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    /**
     * @param permalinkUrl The permalinkUrl
     */
    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    /**
     * @return The promoted
     */
    public long getPromoted() {
        return promoted;
    }

    /**
     * @param promoted The promoted
     */
    public void setPromoted(long promoted) {
        this.promoted = promoted;
    }

    /**
     * @return The postId
     */
    public long getPostId() {
        return postId;
    }

    /**
     * @param postId The postId
     */
    public void setPostId(long postId) {
        this.postId = postId;
    }

    /**
     * @return The profileBackground
     */
    public String getProfileBackground() {
        return profileBackground;
    }

    /**
     * @param profileBackground The profileBackground
     */
    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }

    /**
     * @return The videoUrl
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * @param videoUrl The videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * @return The followRequested
     */
    public long getFollowRequested() {
        return followRequested;
    }

    /**
     * @param followRequested The followRequested
     */
    public void setFollowRequested(long followRequested) {
        this.followRequested = followRequested;
    }

    /**
     * @return The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return The hasSimilarPosts
     */
    public long getHasSimilarPosts() {
        return hasSimilarPosts;
    }

    /**
     * @param hasSimilarPosts The hasSimilarPosts
     */
    public void setHasSimilarPosts(long hasSimilarPosts) {
        this.hasSimilarPosts = hasSimilarPosts;
    }

    /**
     * @return The shareUrl
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * @param shareUrl The shareUrl
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * @return The myRepostId
     */
    public long getMyRepostId() {
        return myRepostId;
    }

    /**
     * @param myRepostId The myRepostId
     */
    public void setMyRepostId(long myRepostId) {
        this.myRepostId = myRepostId;
    }

    /**
     * @return The following
     */
    public long getFollowing() {
        return following;
    }

    /**
     * @param following The following
     */
    public void setFollowing(long following) {
        this.following = following;
    }

    /**
     * @return The hasRemixes
     */
    public long getHasRemixes() {
        return hasRemixes;
    }

    /**
     * @param hasRemixes The hasRemixes
     */
    public void setHasRemixes(long hasRemixes) {
        this.hasRemixes = hasRemixes;
    }

    /**
     * @return The venueCategoryId
     */
    public String getVenueCategoryId() {
        return venueCategoryId;
    }

    /**
     * @param venueCategoryId The venueCategoryId
     */
    public void setVenueCategoryId(String venueCategoryId) {
        this.venueCategoryId = venueCategoryId;
    }

    /**
     * @return The venueName
     */
    public String getVenueName() {
        return venueName;
    }

    /**
     * @param venueName The venueName
     */
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    /**
     * @return The venueCategoryShortName
     */
    public String getVenueCategoryShortName() {
        return venueCategoryShortName;
    }

    /**
     * @param venueCategoryShortName The venueCategoryShortName
     */
    public void setVenueCategoryShortName(String venueCategoryShortName) {
        this.venueCategoryShortName = venueCategoryShortName;
    }

    /**
     * @return The venueCity
     */
    public String getVenueCity() {
        return venueCity;
    }

    /**
     * @param venueCity The venueCity
     */
    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    /**
     * @return The venueCountryCode
     */
    public String getVenueCountryCode() {
        return venueCountryCode;
    }

    /**
     * @param venueCountryCode The venueCountryCode
     */
    public void setVenueCountryCode(String venueCountryCode) {
        this.venueCountryCode = venueCountryCode;
    }

    /**
     * @return The venueState
     */
    public String getVenueState() {
        return venueState;
    }

    /**
     * @param venueState The venueState
     */
    public void setVenueState(String venueState) {
        this.venueState = venueState;
    }

    /**
     * @return The venueAddress
     */
    public String getVenueAddress() {
        return venueAddress;
    }

    /**
     * @param venueAddress The venueAddress
     */
    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    /**
     * @return The venueCategoryIconUrl
     */
    public String getVenueCategoryIconUrl() {
        return venueCategoryIconUrl;
    }

    /**
     * @param venueCategoryIconUrl The venueCategoryIconUrl
     */
    public void setVenueCategoryIconUrl(String venueCategoryIconUrl) {
        this.venueCategoryIconUrl = venueCategoryIconUrl;
    }

}