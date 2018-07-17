package com.moez.QKSMS.injection

import com.moez.QKSMS.feature.blocked.BlockedActivity
import com.moez.QKSMS.feature.blocked.BlockedActivityModule
import com.moez.QKSMS.feature.compose.ComposeActivity
import com.moez.QKSMS.feature.compose.ComposeActivityModule
import com.moez.QKSMS.feature.conversationinfo.ConversationInfoActivity
import com.moez.QKSMS.feature.conversationinfo.ConversationInfoActivityModule
import com.moez.QKSMS.feature.gallery.GalleryActivity
import com.moez.QKSMS.feature.gallery.GalleryActivityModule
import com.moez.QKSMS.feature.main.MainActivity
import com.moez.QKSMS.feature.main.MainActivityModule
import com.moez.QKSMS.feature.notificationprefs.NotificationPrefsActivity
import com.moez.QKSMS.feature.notificationprefs.NotificationPrefsActivityModule
import com.moez.QKSMS.feature.plus.PlusActivity
import com.moez.QKSMS.feature.plus.PlusActivityModule
import com.moez.QKSMS.feature.qkreply.QkReplyActivity
import com.moez.QKSMS.feature.qkreply.QkReplyActivityModule
import com.moez.QKSMS.feature.scheduled.ScheduledActivity
import com.moez.QKSMS.feature.scheduled.ScheduledActivityModule
import com.moez.QKSMS.feature.settings.SettingsActivity
import com.moez.QKSMS.feature.themepicker.ThemePickerActivity
import com.moez.QKSMS.feature.themepicker.ThemePickerActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [PlusActivityModule::class])
    abstract fun bindPlusActivity(): PlusActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ComposeActivityModule::class])
    abstract fun bindComposeActivity(): ComposeActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ConversationInfoActivityModule::class])
    abstract fun bindConversationInfoActivity(): ConversationInfoActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [GalleryActivityModule::class])
    abstract fun bindGalleryActivity(): GalleryActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [NotificationPrefsActivityModule::class])
    abstract fun bindNotificationPrefsActivity(): NotificationPrefsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [QkReplyActivityModule::class])
    abstract fun bindQkReplyActivity(): QkReplyActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ScheduledActivityModule::class])
    abstract fun bindScheduledActivity(): ScheduledActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [])
    abstract fun bindSettingsActivity(): SettingsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [BlockedActivityModule::class])
    abstract fun bindBlockedActivity(): BlockedActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ThemePickerActivityModule::class])
    abstract fun bindThemePickerActivity(): ThemePickerActivity

}