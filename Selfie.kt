package com.yearflip.data.model
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "selfies")
data class Selfie(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val originalImagePath: String,
    val alignedImagePath: String,
    val thumbnailPath: String? = null,
    val captureDate: Long,
    val createdAt: Long = System.currentTimeMillis(),
    val alignmentQuality: Float,
    val faceRotation: Float,
    val smileProbability: Float,
    val eyesOpenProbability: Float,
    val cloudPath: String? = null,
    val isSynced: Boolean = false,
    val isDeleted: Boolean = false
)