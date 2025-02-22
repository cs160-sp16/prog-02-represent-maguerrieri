package me.guerrieri.mario.represent.common;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by marioguerrieri on 3/1/16.
 */
public class Committee implements Parcelable {
    public final String title;
    public final String desc;

    public Committee(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public static final Parcelable.Creator<Committee> CREATOR = new Parcelable.Creator<Committee>() {
        @Override
        public Committee createFromParcel(Parcel source) {
            return new Committee(source);
        }

        @Override
        public Committee[] newArray(int size) {
            return new Committee[size];
        }
    };

    public Committee(Parcel parcel) {
        this.title = parcel.readString();
        this.desc = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.desc);
    }
}
