!--docs:
title: "Example Article: Android Material Toggle Group Button"
layout: detail
section: components
excerpt: "This is an example of the Android Material Button Toggle Group developer article for material.io.
iconId:
path: /
api_doc_root:
-->

# Material Button Toggle Group (Toggle button)

`Material Button Toggle Group` is a customizable button component with updated visual styles.

For more information, go to the material.io [Buttons](http://material.io/components/buttons) page.

<img src="" alt="Toggle group of buttons with icons">

## Using 'MaterialButtonToggleGroup'

`MaterialButtonToggleGroup`, sometimes referred to as `Toggle Button`, `Toggle
Button Group`, or `Segmented Selector`, is a `ViewGroup` that groups together
several checkable `MaterialButton` child views. The buttons in this
group will be shown on a single line.

### Related APIs
Go  to the [Android MaterialButtonToggleGroup API](https://developer.android.com/reference/com/google/android/material/button/MaterialButtonToggleGroup) for more details.

**Note** We recommend that child buttons use an outlined style. For more information on button styling, see [MaterialButton](MaterialButtonExample.md)

```xml
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
        /*...*/
    <com.google.android.material.button.MaterialButton
        style="?attr/materialButtonOutlinedStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/button_label_custom"/>

</com.google.android.material.button.MaterialButtonToggleGroup>
```

#### Material button toggle group attributes

Attribute | Description | Possible values
---|---|---
`android:id` | | `"@+id/toggle_button_group"`
`android:layout_width` | | `"wrap_content"`
`android:layout_height` | | `"wrap_content"`
`android:enabled` | | `true`\|`false`
`style`| |`"@style/Widget.MaterialComponents.Button.UnelevatedButton"` </br> `"@style/Widget.MaterialComponents.Button.TextButton"`

#### Material button toggle group methods

Method | Description
---|---
`addView(View)`| Programmatically adds buttons to the toggle group
`OnButtonCheckedListener` | Listens for changes to the child buttons' checked state
`addOnButtonCheckedListener`| Adds a listener to check the state of child buttons
`removeOnButtonCheckedListener` | Removes listener that checks the sate of child buttons

## Examples

### Example: Toggle group with buttons
The following example shows a toggle group with outlined buttons.

<img src="" alt="toggle button group with outlined buttons"

```xml
\* example code here *\
```

### Example: Toggle group with icon toggle buttons over images

<img src="" alt="toggle button group with icons buttons over images"

```xml
\* example code here *\
```
