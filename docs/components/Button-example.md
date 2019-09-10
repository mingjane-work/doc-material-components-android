<!--docs:
title: ""
layout: detail
section: components
excerpt: "Buttons implemented for Android"
iconId:
path: /
api_doc_root:
initial_release:
-->
<!--initial_release field required with first platform version supported -->

# Buttons


 Buttons allow users to take actions and make choices with a single tap.
 Buttons can be customized to meet your style requirements.

 For more information, go to the [Buttons](https://material.io/components/buttons/#usage) guidance page.

## Buttons Variants

* [Text button](#text-button)
* [Outlined button](#outlined-button)
* [Contained button](#contained-button)
* [Toggle button](#toggle-button)


<img src="" alt="Buttons implemented for Android. From top left to bottom right: text, outlined, contained, toggle.">

**Note** All button variants can be used with icons with the addition of the [`app:icon`](https://developer.android.com/reference/com/google/android/material/button/MaterialButton.html#attr_MaterialButton_icon) and related attributes.The `.Icon` style should only be used for start-gravity icon buttons. If your icon is end-gravity, you cannot use a `.Icon` style and must instead manually adjust your padding such that the visual adjustment is mirrored.

<img src="" alt="button showing buttons with start-gravity and end-gravity icons">

## Using Buttons

### Text button

<img src="" alt="example text button image">

#### APIs used
 * [MaterialButton](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)

Text buttons are typically used for less-pronounced actions, including those located:
 * In dialogs
 * In cards
In cards, text buttons help maintain an emphasis on card content.

#### Text button sample code
```xml
<com.google.android.material.button.MaterialButton
  android:id="@+id/material_text_button"
  style="@style/Widget.MaterialComponents.Button.TextButton"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="@string/text_button_label_enabled"/>
```

### Outline button

<img src="" alt="example outlined button image">

#### APIs used
* [MaterialButton](https://developer.android.com/reference/com/google/android/material/button/MaterialButton)

Outline buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

#### Outline button sample code
```xml
<com.google.android.material.button.MaterialButton
  android:id="@+id/material_text_button"
  style="@style/Widget.MaterialComponents.Button.OutlinedButton"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="@string/outlined_button_label_enabled"/>
```
### Contained button

<img src="" alt="example contained button image">

Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

**Note** Elevated `MaterialButtons` have a shadow that can extend outside the bounds of the button. For this reason, the wrapping parent element should set to android:clipToPadding="false" in cases where the button shadow could be clipped by the parent bounds.

#### APIs used
* [MaterialButton](https://developer.android.com/reference/com/google/android/material/button/MaterialButton.html)
* [GridLayout](https://developer.android.com/reference/android/widget/GridLayout.html)

#### Contained button sample code
<img src="" alt="example contained button image">

``` xml
<com.google.android.material.button.MaterialButton
  android:id="@+id/material_button"
  style="@style/Widget.MaterialComponents.Button"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="@string/button_label_enabled"/>
```

<img src="" alt="example contained button image with grid layout">

#### Contained button example with wrapping parent element GridLayout

 ```xml
 <GridLayout
    android:id="@+id/grid"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_gravity="center"
      android:padding="16dp"
      android:clipToPadding="false"
      android:columnCount="2">

    <com.google.android.material.button.MaterialButton
        android:id="@+id/material_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_enabled"/>

    <Space/>
  </GridLayout>
 ```

### Toggle button

**Note** MaterialButtonToggleGroup uses MaterialButton as child objects.
The toggle button is a [`ViewGroup`](https://developer.android.com/reference/android/view/ViewGroup.html) that groups together several `MaterialButton` elements.

#### APIs Used

* [MaterialButton](https://developer.android.com/reference/com/google/android/material/button/MaterialButton.html)
* [MaterialButtonToggleGroup](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup)

<img src="" alt="examplebutton image with grid layout">

#### Toggle button sample code

 ```
 <com.google.android.material.button.MaterialButtonToggleGroup
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/toggle_button_group"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_private"/>
  <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_team"/>
    <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_everyone"/>
    <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_custom"/>

 </com.google.android.material.button.MaterialButtonToggleGroup>```
