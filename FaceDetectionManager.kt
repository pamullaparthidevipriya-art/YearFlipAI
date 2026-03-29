import android.graphics.Bitmap
import android.graphics.Rect
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.face.Face
import com.google.mlkit.vision.face.FaceDetection
import com.google.mlkit.vision.face.FaceDetector
import com.google.mlkit.vision.face.FaceDetectorOptions

class FaceDetectionManager {

    private var faceDetector: FaceDetector

    init {
        val realTimeOpts = FaceDetectorOptions.Builder()
            .setPreferredLaunchType(FaceDetectorOptions.PREFFERED_LAUNCH_TYPE_REAL_TIME)
            .setEnableClassification(true)
            .setEnableTracking(true)
            .build()

        faceDetector = FaceDetection.getClient(realTimeOpts)
    }

    fun detectFaces(image: Bitmap) {
        val inputImage = InputImage.fromBitmap(image, 0)
        faceDetector.process(inputImage)
            .addOnSuccessListener { faces: List<Face> ->
                // Handle detected faces
                for (face in faces) {
                    val bounds: Rect = face.boundingBox
                    // Process each face bounds
                }
            }
            .addOnFailureListener { e ->
                // Handle exception
            }
    }
}