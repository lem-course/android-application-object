package ep.appobject

import android.app.Application

/**
 * Ta razred drži reference na podatke, ki jih zelimo deliti med aktivnostmi
 */
class MyApplicationObject : Application() {
    var ime: String? = null
}