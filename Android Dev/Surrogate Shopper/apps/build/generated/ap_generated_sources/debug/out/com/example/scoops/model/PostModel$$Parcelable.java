
package com.example.scoops.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class PostModel$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.scoops.model.PostModel>
{

    private com.example.scoops.model.PostModel postModel$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<PostModel$$Parcelable>CREATOR = new Creator<PostModel$$Parcelable>() {


        @Override
        public PostModel$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new PostModel$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public PostModel$$Parcelable[] newArray(int size) {
            return new PostModel$$Parcelable[size] ;
        }

    }
    ;

    public PostModel$$Parcelable(com.example.scoops.model.PostModel postModel$$2) {
        postModel$$0 = postModel$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(postModel$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.example.scoops.model.PostModel postModel$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(postModel$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(postModel$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "profileUrl"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "statusImage"));
            parcel$$1 .writeInt((InjectionUtil.getField(boolean.class, com.example.scoops.model.PostModel.class, postModel$$1, "isLiked")? 1 : 0));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "privacy"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "likeCount"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "postId"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "hasComment"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "commentCount"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "postUserId"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "userToken"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "post"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "statusTime"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.example.scoops.model.PostModel.class, postModel$$1, "name"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.scoops.model.PostModel getParcel() {
        return postModel$$0;
    }

    public static com.example.scoops.model.PostModel read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.example.scoops.model.PostModel postModel$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            postModel$$4 = new com.example.scoops.model.PostModel();
            identityMap$$1 .put(reservation$$0, postModel$$4);
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "profileUrl", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "statusImage", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "isLiked", (parcel$$3 .readInt() == 1));
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "privacy", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "likeCount", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "postId", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "hasComment", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "commentCount", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "postUserId", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "userToken", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "post", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "statusTime", parcel$$3 .readString());
            InjectionUtil.setField(com.example.scoops.model.PostModel.class, postModel$$4, "name", parcel$$3 .readString());
            com.example.scoops.model.PostModel postModel$$3 = postModel$$4;
            identityMap$$1 .put(identity$$1, postModel$$3);
            return postModel$$3;
        }
    }

}
