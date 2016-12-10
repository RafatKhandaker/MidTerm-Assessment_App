package com.blackjacksmart.reddragon.midtermassessmentapp.network.POJOS;

/**
 * Created by RedDragon on 12/10/16.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VinePOJO {

    private AudioTrack audioTrack;
    private Comments comments;
    private Data data;
    private User user;

    public AudioTrack getAudioTrack(){ return audioTrack;}
    public Comments getComments(){ return comments; }
    public Data getData(){ return data; }
    public User getUser(){ return user; }


    public class AudioTrack {

        private String origin;
        private String created;
        private Object deleted;
        private long trackId;
        private Object modified;
        private long numberOfMeasures;
        private Track track;
        private double audioOffset;
        private long snapToBeat;
        private long linkId;
        private double duration;
        private long averageBpm;
        private double videoOffset;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The origin
         */
        public String getOrigin() {
            return origin;
        }

        /**
         *
         * @param origin
         * The origin
         */
        public void setOrigin(String origin) {
            this.origin = origin;
        }

        /**
         *
         * @return
         * The created
         */
        public String getCreated() {
            return created;
        }

        /**
         *
         * @param created
         * The created
         */
        public void setCreated(String created) {
            this.created = created;
        }

        /**
         *
         * @return
         * The deleted
         */
        public Object getDeleted() {
            return deleted;
        }

        /**
         *
         * @param deleted
         * The deleted
         */
        public void setDeleted(Object deleted) {
            this.deleted = deleted;
        }

        /**
         *
         * @return
         * The trackId
         */
        public long getTrackId() {
            return trackId;
        }

        /**
         *
         * @param trackId
         * The trackId
         */
        public void setTrackId(long trackId) {
            this.trackId = trackId;
        }

        /**
         *
         * @return
         * The modified
         */
        public Object getModified() {
            return modified;
        }

        /**
         *
         * @param modified
         * The modified
         */
        public void setModified(Object modified) {
            this.modified = modified;
        }

        /**
         *
         * @return
         * The numberOfMeasures
         */
        public long getNumberOfMeasures() {
            return numberOfMeasures;
        }

        /**
         *
         * @param numberOfMeasures
         * The numberOfMeasures
         */
        public void setNumberOfMeasures(long numberOfMeasures) {
            this.numberOfMeasures = numberOfMeasures;
        }

        /**
         *
         * @return
         * The track
         */
        public Track getTrack() {
            return track;
        }

        /**
         *
         * @param track
         * The track
         */
        public void setTrack(Track track) {
            this.track = track;
        }

        /**
         *
         * @return
         * The audioOffset
         */
        public double getAudioOffset() {
            return audioOffset;
        }

        /**
         *
         * @param audioOffset
         * The audioOffset
         */
        public void setAudioOffset(double audioOffset) {
            this.audioOffset = audioOffset;
        }

        /**
         *
         * @return
         * The snapToBeat
         */
        public long getSnapToBeat() {
            return snapToBeat;
        }

        /**
         *
         * @param snapToBeat
         * The snapToBeat
         */
        public void setSnapToBeat(long snapToBeat) {
            this.snapToBeat = snapToBeat;
        }

        /**
         *
         * @return
         * The linkId
         */
        public long getLinkId() {
            return linkId;
        }

        /**
         *
         * @param linkId
         * The linkId
         */
        public void setLinkId(long linkId) {
            this.linkId = linkId;
        }

        /**
         *
         * @return
         * The duration
         */
        public double getDuration() {
            return duration;
        }

        /**
         *
         * @param duration
         * The duration
         */
        public void setDuration(double duration) {
            this.duration = duration;
        }

        /**
         *
         * @return
         * The averageBpm
         */
        public long getAverageBpm() {
            return averageBpm;
        }

        /**
         *
         * @param averageBpm
         * The averageBpm
         */
        public void setAverageBpm(long averageBpm) {
            this.averageBpm = averageBpm;
        }

        /**
         *
         * @return
         * The videoOffset
         */
        public double getVideoOffset() {
            return videoOffset;
        }

        /**
         *
         * @param videoOffset
         * The videoOffset
         */
        public void setVideoOffset(double videoOffset) {
            this.videoOffset = videoOffset;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Comments {

        private long count;
        private String anchorStr;
        private List<Object> records = null;
        private Object previousPage;
        private String backAnchor;
        private Object anchor;
        private Object nextPage;
        private long size;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The count
         */
        public long getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(long count) {
            this.count = count;
        }

        /**
         *
         * @return
         * The anchorStr
         */
        public String getAnchorStr() {
            return anchorStr;
        }

        /**
         *
         * @param anchorStr
         * The anchorStr
         */
        public void setAnchorStr(String anchorStr) {
            this.anchorStr = anchorStr;
        }

        /**
         *
         * @return
         * The records
         */
        public List<Object> getRecords() {
            return records;
        }

        /**
         *
         * @param records
         * The records
         */
        public void setRecords(List<Object> records) {
            this.records = records;
        }

        /**
         *
         * @return
         * The previousPage
         */
        public Object getPreviousPage() {
            return previousPage;
        }

        /**
         *
         * @param previousPage
         * The previousPage
         */
        public void setPreviousPage(Object previousPage) {
            this.previousPage = previousPage;
        }

        /**
         *
         * @return
         * The backAnchor
         */
        public String getBackAnchor() {
            return backAnchor;
        }

        /**
         *
         * @param backAnchor
         * The backAnchor
         */
        public void setBackAnchor(String backAnchor) {
            this.backAnchor = backAnchor;
        }

        /**
         *
         * @return
         * The anchor
         */
        public Object getAnchor() {
            return anchor;
        }

        /**
         *
         * @param anchor
         * The anchor
         */
        public void setAnchor(Object anchor) {
            this.anchor = anchor;
        }

        /**
         *
         * @return
         * The nextPage
         */
        public Object getNextPage() {
            return nextPage;
        }

        /**
         *
         * @param nextPage
         * The nextPage
         */
        public void setNextPage(Object nextPage) {
            this.nextPage = nextPage;
        }

        /**
         *
         * @return
         * The size
         */
        public long getSize() {
            return size;
        }

        /**
         *
         * @param size
         * The size
         */
        public void setSize(long size) {
            this.size = size;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Data {

        private long count;
        private String anchorStr;
        private List<Record> records = null;
        private Object previousPage;
        private String backAnchor;
        private long anchor;
        private long nextPage;
        private long size;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The count
         */
        public long getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(long count) {
            this.count = count;
        }

        /**
         *
         * @return
         * The anchorStr
         */
        public String getAnchorStr() {
            return anchorStr;
        }

        /**
         *
         * @param anchorStr
         * The anchorStr
         */
        public void setAnchorStr(String anchorStr) {
            this.anchorStr = anchorStr;
        }

        /**
         *
         * @return
         * The records
         */
        public List<Record> getRecords() {
            return records;
        }

        /**
         *
         * @param records
         * The records
         */
        public void setRecords(List<Record> records) {
            this.records = records;
        }

        /**
         *
         * @return
         * The previousPage
         */
        public Object getPreviousPage() {
            return previousPage;
        }

        /**
         *
         * @param previousPage
         * The previousPage
         */
        public void setPreviousPage(Object previousPage) {
            this.previousPage = previousPage;
        }

        /**
         *
         * @return
         * The backAnchor
         */
        public String getBackAnchor() {
            return backAnchor;
        }

        /**
         *
         * @param backAnchor
         * The backAnchor
         */
        public void setBackAnchor(String backAnchor) {
            this.backAnchor = backAnchor;
        }

        /**
         *
         * @return
         * The anchor
         */
        public long getAnchor() {
            return anchor;
        }

        /**
         *
         * @param anchor
         * The anchor
         */
        public void setAnchor(long anchor) {
            this.anchor = anchor;
        }

        /**
         *
         * @return
         * The nextPage
         */
        public long getNextPage() {
            return nextPage;
        }

        /**
         *
         * @param nextPage
         * The nextPage
         */
        public void setNextPage(long nextPage) {
            this.nextPage = nextPage;
        }

        /**
         *
         * @return
         * The size
         */
        public long getSize() {
            return size;
        }

        /**
         *
         * @param size
         * The size
         */
        public void setSize(long size) {
            this.size = size;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Example {

        private String code;
        private Data data;
        private boolean success;
        private String error;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The code
         */
        public String getCode() {
            return code;
        }

        /**
         *
         * @param code
         * The code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /**
         *
         * @return
         * The data
         */
        public Data getData() {
            return data;
        }

        /**
         *
         * @param data
         * The data
         */
        public void setData(Data data) {
            this.data = data;
        }

        /**
         *
         * @return
         * The success
         */
        public boolean isSuccess() {
            return success;
        }

        /**
         *
         * @param success
         * The success
         */
        public void setSuccess(boolean success) {
            this.success = success;
        }

        /**
         *
         * @return
         * The error
         */
        public String getError() {
            return error;
        }

        /**
         *
         * @param error
         * The error
         */
        public void setError(String error) {
            this.error = error;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Likes {

        private long count;
        private String anchorStr;
        private List<Record_> records = null;
        private Object previousPage;
        private String backAnchor;
        private long anchor;
        private long nextPage;
        private long size;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The count
         */
        public long getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(long count) {
            this.count = count;
        }

        /**
         *
         * @return
         * The anchorStr
         */
        public String getAnchorStr() {
            return anchorStr;
        }

        /**
         *
         * @param anchorStr
         * The anchorStr
         */
        public void setAnchorStr(String anchorStr) {
            this.anchorStr = anchorStr;
        }

        /**
         *
         * @return
         * The records
         */
        public List<Record_> getRecords() {
            return records;
        }

        /**
         *
         * @param records
         * The records
         */
        public void setRecords(List<Record_> records) {
            this.records = records;
        }

        /**
         *
         * @return
         * The previousPage
         */
        public Object getPreviousPage() {
            return previousPage;
        }

        /**
         *
         * @param previousPage
         * The previousPage
         */
        public void setPreviousPage(Object previousPage) {
            this.previousPage = previousPage;
        }

        /**
         *
         * @return
         * The backAnchor
         */
        public String getBackAnchor() {
            return backAnchor;
        }

        /**
         *
         * @param backAnchor
         * The backAnchor
         */
        public void setBackAnchor(String backAnchor) {
            this.backAnchor = backAnchor;
        }

        /**
         *
         * @return
         * The anchor
         */
        public long getAnchor() {
            return anchor;
        }

        /**
         *
         * @param anchor
         * The anchor
         */
        public void setAnchor(long anchor) {
            this.anchor = anchor;
        }

        /**
         *
         * @return
         * The nextPage
         */
        public long getNextPage() {
            return nextPage;
        }

        /**
         *
         * @param nextPage
         * The nextPage
         */
        public void setNextPage(long nextPage) {
            this.nextPage = nextPage;
        }

        /**
         *
         * @return
         * The size
         */
        public long getSize() {
            return size;
        }

        /**
         *
         * @param size
         * The size
         */
        public void setSize(long size) {
            this.size = size;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Loops {

        private double count;
        private double velocity;
        private long onFire;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The count
         */
        public double getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(double count) {
            this.count = count;
        }

        /**
         *
         * @return
         * The velocity
         */
        public double getVelocity() {
            return velocity;
        }

        /**
         *
         * @param velocity
         * The velocity
         */
        public void setVelocity(double velocity) {
            this.velocity = velocity;
        }

        /**
         *
         * @return
         * The onFire
         */
        public long getOnFire() {
            return onFire;
        }

        /**
         *
         * @param onFire
         * The onFire
         */
        public void setOnFire(long onFire) {
            this.onFire = onFire;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Record {

        private long liked;
        private String videoDashUrl;
        private String foursquareVenueId;
        private long remixDisabled;
        private long userId;
        private long _private;
        private Object videoWebmUrl;
        private Loops loops;
        private String thumbnailUrl;
        private long explicitContent;
        private Repost repost;
        private long verified;
        private String avatarUrl;
        private Comments comments;
        private List<Object> entities = null;
        private String videoLowURL;
        private List<String> vanityUrls = null;
        private long blocked;
        private String username;
        private String description;
        private List<Object> tags = null;
        private String permalinkUrl;
        private long promoted;
        private long postId;
        private String profileBackground;
        private String videoUrl;
        private long followRequested;
        private String created;
        private long hasSimilarPosts;
        private String shareUrl;
        private long myRepostId;
        private long following;
        private Reposts reposts;
        private Likes likes;
        private long hasRemixes;
        private String venueCategoryId;
        private String venueName;
        private String venueCategoryShortName;
        private String venueCity;
        private String venueCountryCode;
        private String venueState;
        private String venueAddress;
        private String venueCategoryIconUrl;
        private List<AudioTrack> audioTracks = null;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The liked
         */
        public long getLiked() {
            return liked;
        }

        /**
         *
         * @param liked
         * The liked
         */
        public void setLiked(long liked) {
            this.liked = liked;
        }

        /**
         *
         * @return
         * The videoDashUrl
         */
        public String getVideoDashUrl() {
            return videoDashUrl;
        }

        /**
         *
         * @param videoDashUrl
         * The videoDashUrl
         */
        public void setVideoDashUrl(String videoDashUrl) {
            this.videoDashUrl = videoDashUrl;
        }

        /**
         *
         * @return
         * The foursquareVenueId
         */
        public String getFoursquareVenueId() {
            return foursquareVenueId;
        }

        /**
         *
         * @param foursquareVenueId
         * The foursquareVenueId
         */
        public void setFoursquareVenueId(String foursquareVenueId) {
            this.foursquareVenueId = foursquareVenueId;
        }

        /**
         *
         * @return
         * The remixDisabled
         */
        public long getRemixDisabled() {
            return remixDisabled;
        }

        /**
         *
         * @param remixDisabled
         * The remixDisabled
         */
        public void setRemixDisabled(long remixDisabled) {
            this.remixDisabled = remixDisabled;
        }

        /**
         *
         * @return
         * The userId
         */
        public long getUserId() {
            return userId;
        }

        /**
         *
         * @param userId
         * The userId
         */
        public void setUserId(long userId) {
            this.userId = userId;
        }

        /**
         *
         * @return
         * The _private
         */
        public long getPrivate() {
            return _private;
        }

        /**
         *
         * @param _private
         * The private
         */
        public void setPrivate(long _private) {
            this._private = _private;
        }

        /**
         *
         * @return
         * The videoWebmUrl
         */
        public Object getVideoWebmUrl() {
            return videoWebmUrl;
        }

        /**
         *
         * @param videoWebmUrl
         * The videoWebmUrl
         */
        public void setVideoWebmUrl(Object videoWebmUrl) {
            this.videoWebmUrl = videoWebmUrl;
        }

        /**
         *
         * @return
         * The loops
         */
        public Loops getLoops() {
            return loops;
        }

        /**
         *
         * @param loops
         * The loops
         */
        public void setLoops(Loops loops) {
            this.loops = loops;
        }

        /**
         *
         * @return
         * The thumbnailUrl
         */
        public String getThumbnailUrl() {
            return thumbnailUrl;
        }

        /**
         *
         * @param thumbnailUrl
         * The thumbnailUrl
         */
        public void setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
        }

        /**
         *
         * @return
         * The explicitContent
         */
        public long getExplicitContent() {
            return explicitContent;
        }

        /**
         *
         * @param explicitContent
         * The explicitContent
         */
        public void setExplicitContent(long explicitContent) {
            this.explicitContent = explicitContent;
        }

        /**
         *
         * @return
         * The repost
         */
        public Repost getRepost() {
            return repost;
        }

        /**
         *
         * @param repost
         * The repost
         */
        public void setRepost(Repost repost) {
            this.repost = repost;
        }

        /**
         *
         * @return
         * The verified
         */
        public long getVerified() {
            return verified;
        }

        /**
         *
         * @param verified
         * The verified
         */
        public void setVerified(long verified) {
            this.verified = verified;
        }

        /**
         *
         * @return
         * The avatarUrl
         */
        public String getAvatarUrl() {
            return avatarUrl;
        }

        /**
         *
         * @param avatarUrl
         * The avatarUrl
         */
        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        /**
         *
         * @return
         * The comments
         */
        public Comments getComments() {
            return comments;
        }

        /**
         *
         * @param comments
         * The comments
         */
        public void setComments(Comments comments) {
            this.comments = comments;
        }

        /**
         *
         * @return
         * The entities
         */
        public List<Object> getEntities() {
            return entities;
        }

        /**
         *
         * @param entities
         * The entities
         */
        public void setEntities(List<Object> entities) {
            this.entities = entities;
        }

        /**
         *
         * @return
         * The videoLowURL
         */
        public String getVideoLowURL() {
            return videoLowURL;
        }

        /**
         *
         * @param videoLowURL
         * The videoLowURL
         */
        public void setVideoLowURL(String videoLowURL) {
            this.videoLowURL = videoLowURL;
        }

        /**
         *
         * @return
         * The vanityUrls
         */
        public List<String> getVanityUrls() {
            return vanityUrls;
        }

        /**
         *
         * @param vanityUrls
         * The vanityUrls
         */
        public void setVanityUrls(List<String> vanityUrls) {
            this.vanityUrls = vanityUrls;
        }

        /**
         *
         * @return
         * The blocked
         */
        public long getBlocked() {
            return blocked;
        }

        /**
         *
         * @param blocked
         * The blocked
         */
        public void setBlocked(long blocked) {
            this.blocked = blocked;
        }

        /**
         *
         * @return
         * The username
         */
        public String getUsername() {
            return username;
        }

        /**
         *
         * @param username
         * The username
         */
        public void setUsername(String username) {
            this.username = username;
        }

        /**
         *
         * @return
         * The description
         */
        public String getDescription() {
            return description;
        }

        /**
         *
         * @param description
         * The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         *
         * @return
         * The tags
         */
        public List<Object> getTags() {
            return tags;
        }

        /**
         *
         * @param tags
         * The tags
         */
        public void setTags(List<Object> tags) {
            this.tags = tags;
        }

        /**
         *
         * @return
         * The permalinkUrl
         */
        public String getPermalinkUrl() {
            return permalinkUrl;
        }

        /**
         *
         * @param permalinkUrl
         * The permalinkUrl
         */
        public void setPermalinkUrl(String permalinkUrl) {
            this.permalinkUrl = permalinkUrl;
        }

        /**
         *
         * @return
         * The promoted
         */
        public long getPromoted() {
            return promoted;
        }

        /**
         *
         * @param promoted
         * The promoted
         */
        public void setPromoted(long promoted) {
            this.promoted = promoted;
        }

        /**
         *
         * @return
         * The postId
         */
        public long getPostId() {
            return postId;
        }

        /**
         *
         * @param postId
         * The postId
         */
        public void setPostId(long postId) {
            this.postId = postId;
        }

        /**
         *
         * @return
         * The profileBackground
         */
        public String getProfileBackground() {
            return profileBackground;
        }

        /**
         *
         * @param profileBackground
         * The profileBackground
         */
        public void setProfileBackground(String profileBackground) {
            this.profileBackground = profileBackground;
        }

        /**
         *
         * @return
         * The videoUrl
         */
        public String getVideoUrl() {
            return videoUrl;
        }

        /**
         *
         * @param videoUrl
         * The videoUrl
         */
        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        /**
         *
         * @return
         * The followRequested
         */
        public long getFollowRequested() {
            return followRequested;
        }

        /**
         *
         * @param followRequested
         * The followRequested
         */
        public void setFollowRequested(long followRequested) {
            this.followRequested = followRequested;
        }

        /**
         *
         * @return
         * The created
         */
        public String getCreated() {
            return created;
        }

        /**
         *
         * @param created
         * The created
         */
        public void setCreated(String created) {
            this.created = created;
        }

        /**
         *
         * @return
         * The hasSimilarPosts
         */
        public long getHasSimilarPosts() {
            return hasSimilarPosts;
        }

        /**
         *
         * @param hasSimilarPosts
         * The hasSimilarPosts
         */
        public void setHasSimilarPosts(long hasSimilarPosts) {
            this.hasSimilarPosts = hasSimilarPosts;
        }

        /**
         *
         * @return
         * The shareUrl
         */
        public String getShareUrl() {
            return shareUrl;
        }

        /**
         *
         * @param shareUrl
         * The shareUrl
         */
        public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        /**
         *
         * @return
         * The myRepostId
         */
        public long getMyRepostId() {
            return myRepostId;
        }

        /**
         *
         * @param myRepostId
         * The myRepostId
         */
        public void setMyRepostId(long myRepostId) {
            this.myRepostId = myRepostId;
        }

        /**
         *
         * @return
         * The following
         */
        public long getFollowing() {
            return following;
        }

        /**
         *
         * @param following
         * The following
         */
        public void setFollowing(long following) {
            this.following = following;
        }

        /**
         *
         * @return
         * The reposts
         */
        public Reposts getReposts() {
            return reposts;
        }

        /**
         *
         * @param reposts
         * The reposts
         */
        public void setReposts(Reposts reposts) {
            this.reposts = reposts;
        }

        /**
         *
         * @return
         * The likes
         */
        public Likes getLikes() {
            return likes;
        }

        /**
         *
         * @param likes
         * The likes
         */
        public void setLikes(Likes likes) {
            this.likes = likes;
        }

        /**
         *
         * @return
         * The hasRemixes
         */
        public long getHasRemixes() {
            return hasRemixes;
        }

        /**
         *
         * @param hasRemixes
         * The hasRemixes
         */
        public void setHasRemixes(long hasRemixes) {
            this.hasRemixes = hasRemixes;
        }

        /**
         *
         * @return
         * The venueCategoryId
         */
        public String getVenueCategoryId() {
            return venueCategoryId;
        }

        /**
         *
         * @param venueCategoryId
         * The venueCategoryId
         */
        public void setVenueCategoryId(String venueCategoryId) {
            this.venueCategoryId = venueCategoryId;
        }

        /**
         *
         * @return
         * The venueName
         */
        public String getVenueName() {
            return venueName;
        }

        /**
         *
         * @param venueName
         * The venueName
         */
        public void setVenueName(String venueName) {
            this.venueName = venueName;
        }

        /**
         *
         * @return
         * The venueCategoryShortName
         */
        public String getVenueCategoryShortName() {
            return venueCategoryShortName;
        }

        /**
         *
         * @param venueCategoryShortName
         * The venueCategoryShortName
         */
        public void setVenueCategoryShortName(String venueCategoryShortName) {
            this.venueCategoryShortName = venueCategoryShortName;
        }

        /**
         *
         * @return
         * The venueCity
         */
        public String getVenueCity() {
            return venueCity;
        }

        /**
         *
         * @param venueCity
         * The venueCity
         */
        public void setVenueCity(String venueCity) {
            this.venueCity = venueCity;
        }

        /**
         *
         * @return
         * The venueCountryCode
         */
        public String getVenueCountryCode() {
            return venueCountryCode;
        }

        /**
         *
         * @param venueCountryCode
         * The venueCountryCode
         */
        public void setVenueCountryCode(String venueCountryCode) {
            this.venueCountryCode = venueCountryCode;
        }

        /**
         *
         * @return
         * The venueState
         */
        public String getVenueState() {
            return venueState;
        }

        /**
         *
         * @param venueState
         * The venueState
         */
        public void setVenueState(String venueState) {
            this.venueState = venueState;
        }

        /**
         *
         * @return
         * The venueAddress
         */
        public String getVenueAddress() {
            return venueAddress;
        }

        /**
         *
         * @param venueAddress
         * The venueAddress
         */
        public void setVenueAddress(String venueAddress) {
            this.venueAddress = venueAddress;
        }

        /**
         *
         * @return
         * The venueCategoryIconUrl
         */
        public String getVenueCategoryIconUrl() {
            return venueCategoryIconUrl;
        }

        /**
         *
         * @param venueCategoryIconUrl
         * The venueCategoryIconUrl
         */
        public void setVenueCategoryIconUrl(String venueCategoryIconUrl) {
            this.venueCategoryIconUrl = venueCategoryIconUrl;
        }

        /**
         *
         * @return
         * The audioTracks
         */
        public List<AudioTrack> getAudioTracks() {
            return audioTracks;
        }

        /**
         *
         * @param audioTracks
         * The audio_tracks
         */
        public void setAudioTracks(List<AudioTrack> audioTracks) {
            this.audioTracks = audioTracks;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Record_ {

        private String username;
        private long verified;
        private List<String> vanityUrls = null;
        private String created;
        private long userId;
        private User_ user;
        private long likeId;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The username
         */
        public String getUsername() {
            return username;
        }

        /**
         *
         * @param username
         * The username
         */
        public void setUsername(String username) {
            this.username = username;
        }

        /**
         *
         * @return
         * The verified
         */
        public long getVerified() {
            return verified;
        }

        /**
         *
         * @param verified
         * The verified
         */
        public void setVerified(long verified) {
            this.verified = verified;
        }

        /**
         *
         * @return
         * The vanityUrls
         */
        public List<String> getVanityUrls() {
            return vanityUrls;
        }

        /**
         *
         * @param vanityUrls
         * The vanityUrls
         */
        public void setVanityUrls(List<String> vanityUrls) {
            this.vanityUrls = vanityUrls;
        }

        /**
         *
         * @return
         * The created
         */
        public String getCreated() {
            return created;
        }

        /**
         *
         * @param created
         * The created
         */
        public void setCreated(String created) {
            this.created = created;
        }

        /**
         *
         * @return
         * The userId
         */
        public long getUserId() {
            return userId;
        }

        /**
         *
         * @param userId
         * The userId
         */
        public void setUserId(long userId) {
            this.userId = userId;
        }

        /**
         *
         * @return
         * The user
         */
        public User_ getUser() {
            return user;
        }

        /**
         *
         * @param user
         * The user
         */
        public void setUser(User_ user) {
            this.user = user;
        }

        /**
         *
         * @return
         * The likeId
         */
        public long getLikeId() {
            return likeId;
        }

        /**
         *
         * @param likeId
         * The likeId
         */
        public void setLikeId(long likeId) {
            this.likeId = likeId;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Repost {

        private String username;
        private long verified;
        private List<String> vanityUrls = null;
        private long flagsPlatformLo;
        private long repostId;
        private String avatarUrl;
        private long userId;
        private String profileBackground;
        private String created;
        private User user;
        private long postId;
        private long ipAddress;
        private long flagsPlatformHi;
        private long sourceType;
        private long sourceId;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The username
         */
        public String getUsername() {
            return username;
        }

        /**
         *
         * @param username
         * The username
         */
        public void setUsername(String username) {
            this.username = username;
        }

        /**
         *
         * @return
         * The verified
         */
        public long getVerified() {
            return verified;
        }

        /**
         *
         * @param verified
         * The verified
         */
        public void setVerified(long verified) {
            this.verified = verified;
        }

        /**
         *
         * @return
         * The vanityUrls
         */
        public List<String> getVanityUrls() {
            return vanityUrls;
        }

        /**
         *
         * @param vanityUrls
         * The vanityUrls
         */
        public void setVanityUrls(List<String> vanityUrls) {
            this.vanityUrls = vanityUrls;
        }

        /**
         *
         * @return
         * The flagsPlatformLo
         */
        public long getFlagsPlatformLo() {
            return flagsPlatformLo;
        }

        /**
         *
         * @param flagsPlatformLo
         * The flags|platform_lo
         */
        public void setFlagsPlatformLo(long flagsPlatformLo) {
            this.flagsPlatformLo = flagsPlatformLo;
        }

        /**
         *
         * @return
         * The repostId
         */
        public long getRepostId() {
            return repostId;
        }

        /**
         *
         * @param repostId
         * The repostId
         */
        public void setRepostId(long repostId) {
            this.repostId = repostId;
        }

        /**
         *
         * @return
         * The avatarUrl
         */
        public String getAvatarUrl() {
            return avatarUrl;
        }

        /**
         *
         * @param avatarUrl
         * The avatarUrl
         */
        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        /**
         *
         * @return
         * The userId
         */
        public long getUserId() {
            return userId;
        }

        /**
         *
         * @param userId
         * The userId
         */
        public void setUserId(long userId) {
            this.userId = userId;
        }

        /**
         *
         * @return
         * The profileBackground
         */
        public String getProfileBackground() {
            return profileBackground;
        }

        /**
         *
         * @param profileBackground
         * The profileBackground
         */
        public void setProfileBackground(String profileBackground) {
            this.profileBackground = profileBackground;
        }

        /**
         *
         * @return
         * The created
         */
        public String getCreated() {
            return created;
        }

        /**
         *
         * @param created
         * The created
         */
        public void setCreated(String created) {
            this.created = created;
        }

        /**
         *
         * @return
         * The user
         */
        public User getUser() {
            return user;
        }

        /**
         *
         * @param user
         * The user
         */
        public void setUser(User user) {
            this.user = user;
        }

        /**
         *
         * @return
         * The postId
         */
        public long getPostId() {
            return postId;
        }

        /**
         *
         * @param postId
         * The postId
         */
        public void setPostId(long postId) {
            this.postId = postId;
        }

        /**
         *
         * @return
         * The ipAddress
         */
        public long getIpAddress() {
            return ipAddress;
        }

        /**
         *
         * @param ipAddress
         * The ipAddress
         */
        public void setIpAddress(long ipAddress) {
            this.ipAddress = ipAddress;
        }

        /**
         *
         * @return
         * The flagsPlatformHi
         */
        public long getFlagsPlatformHi() {
            return flagsPlatformHi;
        }

        /**
         *
         * @param flagsPlatformHi
         * The flags|platform_hi
         */
        public void setFlagsPlatformHi(long flagsPlatformHi) {
            this.flagsPlatformHi = flagsPlatformHi;
        }

        /**
         *
         * @return
         * The sourceType
         */
        public long getSourceType() {
            return sourceType;
        }

        /**
         *
         * @param sourceType
         * The sourceType
         */
        public void setSourceType(long sourceType) {
            this.sourceType = sourceType;
        }

        /**
         *
         * @return
         * The sourceId
         */
        public long getSourceId() {
            return sourceId;
        }

        /**
         *
         * @param sourceId
         * The sourceId
         */
        public void setSourceId(long sourceId) {
            this.sourceId = sourceId;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Reposts {

        private long count;
        private String anchorStr;
        private List<Object> records = null;
        private Object previousPage;
        private String backAnchor;
        private Object anchor;
        private Object nextPage;
        private long size;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The count
         */
        public long getCount() {
            return count;
        }

        /**
         *
         * @param count
         * The count
         */
        public void setCount(long count) {
            this.count = count;
        }

        /**
         *
         * @return
         * The anchorStr
         */
        public String getAnchorStr() {
            return anchorStr;
        }

        /**
         *
         * @param anchorStr
         * The anchorStr
         */
        public void setAnchorStr(String anchorStr) {
            this.anchorStr = anchorStr;
        }

        /**
         *
         * @return
         * The records
         */
        public List<Object> getRecords() {
            return records;
        }

        /**
         *
         * @param records
         * The records
         */
        public void setRecords(List<Object> records) {
            this.records = records;
        }

        /**
         *
         * @return
         * The previousPage
         */
        public Object getPreviousPage() {
            return previousPage;
        }

        /**
         *
         * @param previousPage
         * The previousPage
         */
        public void setPreviousPage(Object previousPage) {
            this.previousPage = previousPage;
        }

        /**
         *
         * @return
         * The backAnchor
         */
        public String getBackAnchor() {
            return backAnchor;
        }

        /**
         *
         * @param backAnchor
         * The backAnchor
         */
        public void setBackAnchor(String backAnchor) {
            this.backAnchor = backAnchor;
        }

        /**
         *
         * @return
         * The anchor
         */
        public Object getAnchor() {
            return anchor;
        }

        /**
         *
         * @param anchor
         * The anchor
         */
        public void setAnchor(Object anchor) {
            this.anchor = anchor;
        }

        /**
         *
         * @return
         * The nextPage
         */
        public Object getNextPage() {
            return nextPage;
        }

        /**
         *
         * @param nextPage
         * The nextPage
         */
        public void setNextPage(Object nextPage) {
            this.nextPage = nextPage;
        }

        /**
         *
         * @return
         * The size
         */
        public long getSize() {
            return size;
        }

        /**
         *
         * @param size
         * The size
         */
        public void setSize(long size) {
            this.size = size;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class Track {

        private long albumTrackCount;
        private long hasAudioTrackTimeline;
        private String trackName;
        private long beatsPerMinute;
        private long albumTrackNumber;
        private String albumName;
        private String releaseDate;
        private String artistName;
        private String albumArtist;
        private String composer;
        private String genre;
        private long discNumber;
        private long discCount;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The albumTrackCount
         */
        public long getAlbumTrackCount() {
            return albumTrackCount;
        }

        /**
         *
         * @param albumTrackCount
         * The albumTrackCount
         */
        public void setAlbumTrackCount(long albumTrackCount) {
            this.albumTrackCount = albumTrackCount;
        }

        /**
         *
         * @return
         * The hasAudioTrackTimeline
         */
        public long getHasAudioTrackTimeline() {
            return hasAudioTrackTimeline;
        }

        /**
         *
         * @param hasAudioTrackTimeline
         * The hasAudioTrackTimeline
         */
        public void setHasAudioTrackTimeline(long hasAudioTrackTimeline) {
            this.hasAudioTrackTimeline = hasAudioTrackTimeline;
        }

        /**
         *
         * @return
         * The trackName
         */
        public String getTrackName() {
            return trackName;
        }

        /**
         *
         * @param trackName
         * The trackName
         */
        public void setTrackName(String trackName) {
            this.trackName = trackName;
        }

        /**
         *
         * @return
         * The beatsPerMinute
         */
        public long getBeatsPerMinute() {
            return beatsPerMinute;
        }

        /**
         *
         * @param beatsPerMinute
         * The beatsPerMinute
         */
        public void setBeatsPerMinute(long beatsPerMinute) {
            this.beatsPerMinute = beatsPerMinute;
        }

        /**
         *
         * @return
         * The albumTrackNumber
         */
        public long getAlbumTrackNumber() {
            return albumTrackNumber;
        }

        /**
         *
         * @param albumTrackNumber
         * The albumTrackNumber
         */
        public void setAlbumTrackNumber(long albumTrackNumber) {
            this.albumTrackNumber = albumTrackNumber;
        }

        /**
         *
         * @return
         * The albumName
         */
        public String getAlbumName() {
            return albumName;
        }

        /**
         *
         * @param albumName
         * The albumName
         */
        public void setAlbumName(String albumName) {
            this.albumName = albumName;
        }

        /**
         *
         * @return
         * The releaseDate
         */
        public String getReleaseDate() {
            return releaseDate;
        }

        /**
         *
         * @param releaseDate
         * The releaseDate
         */
        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        /**
         *
         * @return
         * The artistName
         */
        public String getArtistName() {
            return artistName;
        }

        /**
         *
         * @param artistName
         * The artistName
         */
        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        /**
         *
         * @return
         * The albumArtist
         */
        public String getAlbumArtist() {
            return albumArtist;
        }

        /**
         *
         * @param albumArtist
         * The albumArtist
         */
        public void setAlbumArtist(String albumArtist) {
            this.albumArtist = albumArtist;
        }

        /**
         *
         * @return
         * The composer
         */
        public String getComposer() {
            return composer;
        }

        /**
         *
         * @param composer
         * The composer
         */
        public void setComposer(String composer) {
            this.composer = composer;
        }

        /**
         *
         * @return
         * The genre
         */
        public String getGenre() {
            return genre;
        }

        /**
         *
         * @param genre
         * The genre
         */
        public void setGenre(String genre) {
            this.genre = genre;
        }

        /**
         *
         * @return
         * The discNumber
         */
        public long getDiscNumber() {
            return discNumber;
        }

        /**
         *
         * @param discNumber
         * The discNumber
         */
        public void setDiscNumber(long discNumber) {
            this.discNumber = discNumber;
        }

        /**
         *
         * @return
         * The discCount
         */
        public long getDiscCount() {
            return discCount;
        }

        /**
         *
         * @param discCount
         * The discCount
         */
        public void setDiscCount(long discCount) {
            this.discCount = discCount;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class User {

        private String username;
        private long verified;
        private List<String> vanityUrls = null;
        private String avatarUrl;
        private long userId;
        private long _private;
        private String location;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The username
         */
        public String getUsername() {
            return username;
        }

        /**
         *
         * @param username
         * The username
         */
        public void setUsername(String username) {
            this.username = username;
        }

        /**
         *
         * @return
         * The verified
         */
        public long getVerified() {
            return verified;
        }

        /**
         *
         * @param verified
         * The verified
         */
        public void setVerified(long verified) {
            this.verified = verified;
        }

        /**
         *
         * @return
         * The vanityUrls
         */
        public List<String> getVanityUrls() {
            return vanityUrls;
        }

        /**
         *
         * @param vanityUrls
         * The vanityUrls
         */
        public void setVanityUrls(List<String> vanityUrls) {
            this.vanityUrls = vanityUrls;
        }

        /**
         *
         * @return
         * The avatarUrl
         */
        public String getAvatarUrl() {
            return avatarUrl;
        }

        /**
         *
         * @param avatarUrl
         * The avatarUrl
         */
        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        /**
         *
         * @return
         * The userId
         */
        public long getUserId() {
            return userId;
        }

        /**
         *
         * @param userId
         * The userId
         */
        public void setUserId(long userId) {
            this.userId = userId;
        }

        /**
         *
         * @return
         * The _private
         */
        public long getPrivate() {
            return _private;
        }

        /**
         *
         * @param _private
         * The private
         */
        public void setPrivate(long _private) {
            this._private = _private;
        }

        /**
         *
         * @return
         * The location
         */
        public String getLocation() {
            return location;
        }

        /**
         *
         * @param location
         * The location
         */
        public void setLocation(String location) {
            this.location = location;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public class User_ {

        private long _private;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The _private
         */
        public long getPrivate() {
            return _private;
        }

        /**
         *
         * @param _private
         * The private
         */
        public void setPrivate(long _private) {
            this._private = _private;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

}
