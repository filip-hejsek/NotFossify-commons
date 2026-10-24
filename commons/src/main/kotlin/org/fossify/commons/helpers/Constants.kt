package org.fossify.commons.helpers

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Looper
import androidx.annotation.ChecksSdkIntAtLeast
import androidx.annotation.StringRes
import org.fossify.commons.R

const val EXTERNAL_STORAGE_PROVIDER_AUTHORITY = "com.android.externalstorage.documents"

const val EXTRA_SHOW_ADVANCED = "android.content.extra.SHOW_ADVANCED"

const val APP_NAME = "app_name"

const val APP_LICENSES = "app_licenses"

const val APP_FAQ = "app_faq"

const val APP_VERSION_NAME = "app_version_name"

const val APP_PACKAGE_NAME = "app_package_name"

const val APP_REPOSITORY_URL = "app_repo_url"

const val APP_ICON_IDS = "app_icon_ids"

const val APP_ID = "app_id"

const val APP_LAUNCHER_NAME = "app_launcher_name"

const val IS_CUSTOMIZING_COLORS = "is_customizing_colors"

const val NOMEDIA = ".nomedia"

const val SD_OTG_PATTERN = "^/storage/[A-Za-z0-9]{4}-[A-Za-z0-9]{4}$"

const val SD_OTG_SHORT = "^[A-Za-z0-9]{4}-[A-Za-z0-9]{4}$"

const val MD5 = "MD5"

const val SHA1 = "SHA-1"

const val SHA256 = "SHA-256"

const val SHORT_ANIMATION_DURATION = 150L

val DARK_GREY = 0xFF333333.toInt()

const val LOWER_ALPHA = 0.25f

const val MEDIUM_ALPHA = 0.5f

const val HIGHER_ALPHA = 0.75f

const val HOUR_MINUTES = 60

const val DAY_MINUTES = 24 * HOUR_MINUTES

const val MINUTE_SECONDS = 60

const val HOUR_SECONDS = HOUR_MINUTES * 60

const val DAY_SECONDS = DAY_MINUTES * 60

// shared preferences
const val PREFS_KEY = "Prefs"

const val APP_RUN_COUNT = "app_run_count"

const val LAST_VERSION = "last_version"

const val SD_TREE_URI = "tree_uri_2"

const val PRIMARY_ANDROID_DATA_TREE_URI = "primary_android_data_tree_uri_2"

const val OTG_ANDROID_DATA_TREE_URI = "otg_android_data_tree__uri_2"

const val SD_ANDROID_DATA_TREE_URI = "sd_android_data_tree_uri_2"

const val PRIMARY_ANDROID_OBB_TREE_URI = "primary_android_obb_tree_uri_2"

const val OTG_ANDROID_OBB_TREE_URI = "otg_android_obb_tree_uri_2"

const val SD_ANDROID_OBB_TREE_URI = "sd_android_obb_tree_uri_2"

const val OTG_TREE_URI = "otg_tree_uri_2"

const val SD_CARD_PATH = "sd_card_path_2"

const val OTG_REAL_PATH = "otg_real_path_2"

const val INTERNAL_STORAGE_PATH = "internal_storage_path"

const val TEXT_COLOR = "text_color"

const val BACKGROUND_COLOR = "background_color"

const val PRIMARY_COLOR = "primary_color_2"

const val ACCENT_COLOR = "accent_color"

const val APP_ICON_COLOR = "app_icon_color"

const val WIDGET_BG_COLOR = "widget_bg_color"

const val WIDGET_TEXT_COLOR = "widget_text_color"

const val KEEP_LAST_MODIFIED = "keep_last_modified"

const val USE_ENGLISH = "use_english"

const val WAS_USE_ENGLISH_TOGGLED = "was_use_english_toggled"

const val IS_GLOBAL_THEME_ENABLED = "is_global_theme_enabled"

const val IS_SYSTEM_THEME_ENABLED = "is_using_system_theme"

const val LAST_USED_VIEW_PAGER_PAGE = "last_used_view_pager_page"

const val USE_24_HOUR_FORMAT = "use_24_hour_format"

const val OTG_PARTITION = "otg_partition_2"

const val IS_USING_MODIFIED_APP_ICON = "is_using_modified_app_icon"

const val INITIAL_WIDGET_HEIGHT = "initial_widget_height"

const val WIDGET_ID_TO_MEASURE = "widget_id_to_measure"

const val WAS_APP_ON_SD_SHOWN = "was_app_on_sd_shown"

const val DATE_FORMAT = "date_format"

const val FONT_SIZE = "font_size"

const val FAVORITES = "favorites"

const val COLOR_PICKER_RECENT_COLORS = "color_picker_recent_colors"

const val LAST_EXPORT_PATH = "last_export_path"

const val SHOW_CHECKMARKS_ON_SWITCHES = "show_checkmarks_on_switches"

const val USE_BINARY_STORAGE_UNITS = "use_binary_storage_units"

const val CUSTOM_FONT_TYPE = "custom_font_type"

const val CUSTOM_FONT_FILE_NAME = "custom_font_file_name"

const val MAIN = "MAIN"

// licenses
internal const val LICENSE_KOTLIN = 1L

const val LICENSE_SUBSAMPLING = 2L

const val LICENSE_GLIDE = 4L

const val LICENSE_CROPPER = 8L

const val LICENSE_FILTERS = 16L

const val LICENSE_RTL = 32L

const val LICENSE_JODA = 64L

const val LICENSE_STETHO = 128L

const val LICENSE_OTTO = 256L

const val LICENSE_PHOTOVIEW = 512L

const val LICENSE_PICASSO = 1024L

const val LICENSE_PATTERN = 2048L

const val LICENSE_REPRINT = 4096L

const val LICENSE_GIF_DRAWABLE = 8192L

const val LICENSE_AUTOFITTEXTVIEW = 16384L

const val LICENSE_ROBOLECTRIC = 32768L

const val LICENSE_ESPRESSO = 65536L

const val LICENSE_GSON = 131072L

const val LICENSE_LEAK_CANARY = 262144L

const val LICENSE_NUMBER_PICKER = 524288L

const val LICENSE_EXOPLAYER = 1048576L

const val LICENSE_SANSELAN = 4194304L

const val LICENSE_GESTURE_VIEWS = 8388608L

const val LICENSE_INDICATOR_FAST_SCROLL = 16777216L

const val LICENSE_EVENT_BUS = 33554432L

const val LICENSE_AUDIO_RECORD_VIEW = 67108864L

const val LICENSE_SMS_MMS = 134217728L

const val LICENSE_APNG = 268435456L

const val LICENSE_PDF_VIEW_PAGER = 536870912L

const val LICENSE_M3U_PARSER = 1073741824L

const val LICENSE_ANDROID_LAME = 2147483648L

const val LICENSE_PDF_VIEWER = 4294967296L

const val LICENSE_ZIP4J = 8589934592L

const val LICENSE_EVALEX = 17179869184L

const val LICENSE_MAMMOTH = 34359738368L

const val LICENSE_COMMONMARK = 68719476736L

const val LICENSE_JSOUP = 137438953472L

const val LICENSE_COMMONS_CSV = 274877906944L

// global intents
const val OPEN_DOCUMENT_TREE_FOR_ANDROID_DATA_OR_OBB = 1000

const val OPEN_DOCUMENT_TREE_OTG = 1001

const val OPEN_DOCUMENT_TREE_SD = 1002

const val OPEN_DOCUMENT_TREE_FOR_SDK_30 = 1003

const val SELECT_EXPORT_SETTINGS_FILE_INTENT = 1006

const val CREATE_DOCUMENT_SDK_30 = 1008

// sorting
const val SORT_ORDER = "sort_order"

const val SORT_FOLDER_PREFIX =
    "sort_folder_"       // storing folder specific values at using "Use for this folder only"

const val SORT_BY_NAME = 1

const val SORT_BY_DATE_MODIFIED = 2

const val SORT_BY_SIZE = 4

const val SORT_BY_EXTENSION = 16

const val SORT_DESCENDING = 1024

const val SORT_USE_NUMERIC_VALUE = 32768

// permissions
const val PERMISSION_READ_STORAGE = 1

const val PERMISSION_WRITE_STORAGE = 2

const val PERMISSION_CAMERA = 3

const val PERMISSION_RECORD_AUDIO = 4

const val PERMISSION_READ_CONTACTS = 5

const val PERMISSION_WRITE_CONTACTS = 6

const val PERMISSION_READ_CALENDAR = 7

const val PERMISSION_WRITE_CALENDAR = 8

const val PERMISSION_CALL_PHONE = 9

const val PERMISSION_READ_CALL_LOG = 10

const val PERMISSION_WRITE_CALL_LOG = 11

const val PERMISSION_GET_ACCOUNTS = 12

const val PERMISSION_READ_SMS = 13

const val PERMISSION_SEND_SMS = 14

const val PERMISSION_READ_PHONE_STATE = 15

const val PERMISSION_MEDIA_LOCATION = 16

const val PERMISSION_POST_NOTIFICATIONS = 17

const val PERMISSION_READ_MEDIA_IMAGES = 18

const val PERMISSION_READ_MEDIA_VIDEO = 19

const val PERMISSION_READ_MEDIA_AUDIO = 20

const val PERMISSION_ACCESS_COARSE_LOCATION = 21

const val PERMISSION_ACCESS_FINE_LOCATION = 22

const val PERMISSION_READ_MEDIA_VISUAL_USER_SELECTED = 23

const val PERMISSION_READ_SYNC_SETTINGS = 24

// font sizes
const val FONT_SIZE_SMALL = 0

const val FONT_SIZE_MEDIUM = 1

const val FONT_SIZE_LARGE = 2

// font types
const val FONT_TYPE_SYSTEM_DEFAULT = 0

const val FONT_TYPE_MONOSPACE = 1

const val FONT_TYPE_CUSTOM = 2

val photoExtensions: Array<String>
    get() = arrayOf(
        ".jpg",
        ".png",
        ".jpeg",
        ".bmp",
        ".webp",
        ".heic",
        ".heif",
        ".apng",
        ".avif",
        ".jxl"
    )

val videoExtensions: Array<String>
    get() = arrayOf(
        ".mp4",
        ".mkv",
        ".webm",
        ".avi",
        ".3gp",
        ".mov",
        ".m4v",
        ".3gpp"
    )

val audioExtensions: Array<String>
    get() = arrayOf(
        ".mp3",
        ".wav",
        ".wma",
        ".ogg",
        ".m4a",
        ".opus",
        ".flac",
        ".aac",
        ".m4b"
    )

val rawExtensions: Array<String>
    get() = arrayOf(
        ".dng",
        ".orf",
        ".nef",
        ".arw",
        ".rw2",
        ".cr2",
        ".cr3"
    )

val extensionsSupportingEXIF: Array<String>
    get() = arrayOf(
        ".jpg",
        ".jpeg",
        ".png",
        ".webp",
        ".dng"
    )

const val DATE_FORMAT_ONE = "dd.MM.yyyy"

const val DATE_FORMAT_TWO = "dd/MM/yyyy"

const val DATE_FORMAT_THREE = "MM/dd/yyyy"

const val DATE_FORMAT_FOUR = "yyyy-MM-dd"

const val DATE_FORMAT_FIVE = "d MMMM yyyy"

const val DATE_FORMAT_SIX = "MMMM d yyyy"

const val DATE_FORMAT_SEVEN = "MM-dd-yyyy"

const val DATE_FORMAT_EIGHT = "dd-MM-yyyy"

const val TIME_FORMAT_12 = "hh:mm a"

const val TIME_FORMAT_24 = "HH:mm"

// possible icons at the top left corner
enum class NavigationIcon(@StringRes val accessibilityResId: Int) {
    Cross(R.string.close),
    Arrow(R.string.back),
    None(0)
}

fun isOnMainThread() = Looper.myLooper() == Looper.getMainLooper()

fun ensureBackgroundThread(callback: () -> Unit) {
    if (isOnMainThread()) {
        Thread {
            callback()
        }.start()
    } else {
        callback()
    }
}

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.N)
fun isNougatPlus() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.Q)
fun isQPlus() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.R)
fun isRPlus() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.R

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
fun isSPlus() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

@ChecksSdkIntAtLeast(api = Build.VERSION_CODES.TIRAMISU)
fun isTiramisuPlus() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU

val normalizeRegex = "\\p{InCombiningDiacriticalMarks}+".toRegex()

fun getFilePlaceholderDrawables(context: Context): HashMap<String, Drawable> {
    val fileDrawables = HashMap<String, Drawable>()
    hashMapOf<String, Int>().apply {
        put("aep", R.drawable.ic_file_aep)
        put("ai", R.drawable.ic_file_ai)
        put("avi", R.drawable.ic_file_avi)
        put("css", R.drawable.ic_file_css)
        put("csv", R.drawable.ic_file_csv)
        put("dbf", R.drawable.ic_file_dbf)
        put("doc", R.drawable.ic_file_doc)
        put("docx", R.drawable.ic_file_doc)
        put("dwg", R.drawable.ic_file_dwg)
        put("exe", R.drawable.ic_file_exe)
        put("fla", R.drawable.ic_file_fla)
        put("flv", R.drawable.ic_file_flv)
        put("htm", R.drawable.ic_file_html)
        put("html", R.drawable.ic_file_html)
        put("ics", R.drawable.ic_file_ics)
        put("indd", R.drawable.ic_file_indd)
        put("iso", R.drawable.ic_file_iso)
        put("jpg", R.drawable.ic_file_jpg)
        put("jpeg", R.drawable.ic_file_jpg)
        put("js", R.drawable.ic_file_js)
        put("json", R.drawable.ic_file_json)
        put("m4a", R.drawable.ic_file_m4a)
        put("mp3", R.drawable.ic_file_mp3)
        put("mp4", R.drawable.ic_file_mp4)
        put("ogg", R.drawable.ic_file_ogg)
        put("pdf", R.drawable.ic_file_pdf)
        put("plproj", R.drawable.ic_file_plproj)
        put("ppt", R.drawable.ic_file_ppt)
        put("pptx", R.drawable.ic_file_ppt)
        put("prproj", R.drawable.ic_file_prproj)
        put("psd", R.drawable.ic_file_psd)
        put("rtf", R.drawable.ic_file_rtf)
        put("sesx", R.drawable.ic_file_sesx)
        put("sql", R.drawable.ic_file_sql)
        put("svg", R.drawable.ic_file_svg)
        put("txt", R.drawable.ic_file_txt)
        put("vcf", R.drawable.ic_file_vcf)
        put("wav", R.drawable.ic_file_wav)
        put("wmv", R.drawable.ic_file_wmv)
        put("xls", R.drawable.ic_file_xls)
        put("xlsx", R.drawable.ic_file_xls)
        put("xml", R.drawable.ic_file_xml)
        put("zip", R.drawable.ic_file_zip)
    }.forEach { (key, value) ->
        fileDrawables[key] = context.resources.getDrawable(value)
    }
    return fileDrawables
}

const val DEFAULT_FILE_NAME = "contacts.vcf"
