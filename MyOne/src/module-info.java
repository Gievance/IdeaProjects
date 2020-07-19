import com.ModelP.Imp1;
import com.ModelP.Imp2;
import com.ModelP.MyService;

module MyOne {
    exports com.One;
    exports com.Two;
    exports com.ModelP;
    provides MyService with Imp2;
}